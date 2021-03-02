package activitytracker;

import org.mariadb.jdbc.MariaDbDataSource;
import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ActivityDao {

    private DataSource dataSource;

    public ActivityDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Activity insertActivity(Activity activity) {
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("insert into activities(start_time, activity_desc, activity_type) values (?, ?, ?)", Statement.RETURN_GENERATED_KEYS)) {
            preparedStatement.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
            preparedStatement.setString(2, activity.getDesc());
            preparedStatement.setString(3, activity.getType().toString());
            preparedStatement.executeUpdate();
            Activity result = getIdAfterExecuted(activity, preparedStatement);
            insertActivityTrackPoints(activity.getTrackPoints(), result.getId());
            return result;
        } catch (SQLException se) {
            throw new IllegalStateException("Connection failed", se);
        }
    }

    private Activity getIdAfterExecuted(Activity activity, PreparedStatement preparedStatement) throws SQLException {
        try (ResultSet resultSet = preparedStatement.getGeneratedKeys()) {
            if (resultSet.next()) {
                long id = resultSet.getLong(1);
                return new Activity(id, activity.getStartTime(), activity.getDesc(), activity.getType());
            }
        }
        throw new IllegalStateException("Can not get keys");
    }

    private void insertActivityTrackPoints(List<TrackPoint> trackPointList, long activityId) {
        try(Connection connection = dataSource.getConnection()) {
            connection.setAutoCommit(false);
            try (PreparedStatement preparedStatement = connection.prepareStatement("insert into track_points (act_time, lat, lon, activityId) values (?, ?, ?, ?)")) {
                for (TrackPoint trackPoint : trackPointList) {
                    if (!isValidLatLon(trackPoint.getLat(), trackPoint.getLon())) {
                        throw new IllegalArgumentException("Invalid lat or lon");
                    }
                    preparedStatement.setDate(1, Date.valueOf(trackPoint.getTime()));
                    preparedStatement.setDouble(2, trackPoint.getLat());
                    preparedStatement.setDouble(3, trackPoint.getLon());
                    preparedStatement.setLong(4, activityId);
                    preparedStatement.executeUpdate();
                }
                connection.commit();
            } catch (IllegalArgumentException iae) {
                connection.rollback();
            }
        } catch (SQLException se) {
            throw new IllegalStateException("Can not connect", se);
        }
    }

    private boolean isValidLatLon(double lat, double lon) {
        if (lat < -90 || 90 < lat) {
            return false;
        }
        if (lon < -180 || 180 < lon) {
            return false;
        }
        return true;
    }

    private List<Activity> selectActivityByPreparedStatement(PreparedStatement preparedStatement) {
        List<Activity> result = new ArrayList<>();
        try (ResultSet resultSet = preparedStatement.executeQuery()) {
            while (resultSet.next()) {
                Activity activity = new Activity(
                        resultSet.getLong("id"),
                        resultSet.getTimestamp("start_time").toLocalDateTime(),
                        resultSet.getString("activity_desc"),
                        ActivityType.valueOf(resultSet.getString("activity_type")));
                result.add(activity);
            }
            return result;
        } catch (SQLException se) {
            throw new IllegalStateException("Not found");
        }
    }

    private List<TrackPoint> selectTrackPointsByPreparedStatement(PreparedStatement preparedStatement) {
        List<TrackPoint> result = new ArrayList<>();
        try (ResultSet resultSet = preparedStatement.executeQuery()) {
            while (resultSet.next()) {
                TrackPoint trackPoint = new TrackPoint(
                        resultSet.getLong("id"),
                        resultSet.getDate("act_time").toLocalDate(),
                        resultSet.getDouble("lat"),
                        resultSet.getLong("lon"));
                result.add(trackPoint);
            }
            return result;
        } catch (SQLException se) {
            throw new IllegalStateException("Not found");
        }
    }

    public Activity selectActivityById(long id) {
        try(Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("select * from activities where id=?");
            PreparedStatement preparedStatement2 = connection.prepareStatement("select * from track_points where activityId = ?")) {
            preparedStatement.setLong(1, id);
            List<Activity> result = selectActivityByPreparedStatement(preparedStatement);
            if (result.size() == 1) {
                preparedStatement2.setLong(1, id);
                List<TrackPoint> resultPoints = selectTrackPointsByPreparedStatement(preparedStatement2);
                result.get(0).addTrackPoints(resultPoints);
                return result.get(0);
            }
            throw new IllegalArgumentException("Not found");
        } catch (SQLException se) {
            throw new IllegalStateException("Can not connect", se);
        }
    }

    public List<Activity> selectAllActivities() {
        List<Activity> result = new ArrayList<>();
        try(Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("select * from activities");
            ResultSet resultSet = preparedStatement.executeQuery()) {
            while (resultSet.next()) {
                Activity activity = new Activity(
                        resultSet.getLong("id"),
                        resultSet.getTimestamp("start_time").toLocalDateTime(),
                        resultSet.getString("activity_desc"),
                        ActivityType.valueOf(resultSet.getString("activity_type")));
                result.add(activity);
            }
        } catch (SQLException se) {
            throw new IllegalStateException("Can not execute", se);
        }
        return result;
    }

    public List<Activity> selectActivitiesByType(ActivityType type) {
        try (Connection connection = dataSource.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("select * from activities where activity_type = ?")) {
            preparedStatement.setString(1, type.toString());
            return selectActivityByPreparedStatement(preparedStatement);
        } catch (SQLException se) {
            throw new IllegalStateException("Connection failed", se);
        }
    }

    public List<Activity> activitiesBeforeDate(LocalDate date) {
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("select * from activities where start_time < ?")) {
            LocalDateTime actualDate = date.atTime(0,0);
            preparedStatement.setTimestamp(1, Timestamp.valueOf(actualDate));
            return selectActivityByPreparedStatement(preparedStatement);
        } catch (SQLException se) {
            throw new IllegalStateException("Can not connect", se);
        }
    }

    public static void main(String[] args) {
        MariaDbDataSource dataSource;
        try {
            dataSource = new MariaDbDataSource();
            dataSource.setUrl("jdbc:mariadb://localhost:3306/activitytracker?useUnicode=true");
            dataSource.setUser("activitytracker");
            dataSource.setPassword("activitytracker");
        } catch (SQLException se) {
            throw new IllegalStateException("Connection failed", se);
        }
        ActivityDao activityDao = new ActivityDao(dataSource);
        activityDao.activitiesBeforeDate(LocalDate.of(2021,3,3));
        System.out.println(activityDao.activitiesBeforeDate(LocalDate.of(2021,3,3)));

        Activity activity = new Activity(LocalDateTime.of(2021,3,3,13,10),"Running", ActivityType.RUNNING);
        activity.addTrackPoints(List.of(
                new TrackPoint(LocalDate.of(2021,3,3), 67, 23),
                new TrackPoint(LocalDate.of(2021,3,3), 68, 22),
                new TrackPoint(LocalDate.of(2021,3,3), 69, 21)));
        Activity activity2 = activityDao.insertActivity(activity);
        System.out.println(activityDao.selectActivityById(activity2.getId()));
    }
}

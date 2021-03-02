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
            try (ResultSet resultSet = preparedStatement.getGeneratedKeys()) {
                if (resultSet.next()) {
                    long id = resultSet.getLong(1);
                    return new Activity(id, activity.getStartTime(), activity.getDesc(), activity.getType());
                }
            }
        } catch (SQLException se) {
            throw new IllegalStateException("Connection failed", se);
        }
        return activity;
    }

    private List<Activity> selectActivityByPreparedStatement(PreparedStatement preparedStatement) {
        List<Activity> result = new ArrayList<>();
        try (ResultSet resultSet = preparedStatement.executeQuery()) {
            if (resultSet.next()) {
                Activity activity = new Activity(
                        resultSet.getLong("id"),
                        resultSet.getTimestamp("start_time").toLocalDateTime(),
                        resultSet.getString("activity_desc"),
                        ActivityType.valueOf(resultSet.getString("activity_type")));
                result.add(activity);
            } else {
                throw new IllegalArgumentException("Activitiy not found");
            }
        } catch (SQLException se) {
            throw new IllegalStateException("Not found");
        }
        return result;
    }

    public List<Activity> selectActivityById(long id) {
        try(Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("select * from activities where id=?")) {
            preparedStatement.setLong(1, id);
            return selectActivityByPreparedStatement(preparedStatement);
        } catch (SQLException se) {
            throw new IllegalStateException("Wrong input", se);
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
    }
}

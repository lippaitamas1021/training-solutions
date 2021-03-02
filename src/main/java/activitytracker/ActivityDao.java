package activitytracker;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ActivityDao {

    private DataSource dataSource;

    public ActivityDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void insertActivity(Activity activity) {
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("insert into activities(start_time, activity_desc, activity_type) values (?, ?, ?)")) {
            preparedStatement.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
            preparedStatement.setString(2, activity.getDesc());
            preparedStatement.setString(3, activity.getType().toString());
            preparedStatement.executeUpdate();
        } catch (SQLException se) {
            throw new IllegalStateException("Connection failed", se);
        }
    }

    private Activity selectActivityByPreparedStatement(PreparedStatement preparedStatement) {
        try (ResultSet resultSet = preparedStatement.executeQuery()) {
            if (resultSet.next()) {
                Activity activity;
                return activity = new Activity(
                        resultSet.getLong("id"),
                        resultSet.getTimestamp("start_time").toLocalDateTime(),
                        resultSet.getString("activity_desc"),
                        ActivityType.valueOf(resultSet.getString("activity_type")));
            } else {
                throw new IllegalArgumentException("Activitiy not found");
            }
        } catch (SQLException se) {
            throw new IllegalStateException("Not found");
        }
    }

    public Activity selectActivityById(long id) {
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
            return Collections.singletonList(selectActivityByPreparedStatement(preparedStatement));
        } catch (SQLException se) {
            throw new IllegalStateException("Connection failed", se);
        }
    }
}

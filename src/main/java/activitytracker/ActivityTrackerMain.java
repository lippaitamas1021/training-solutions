package activitytracker;

import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.time.LocalDate;

public class ActivityTrackerMain {

//    public void insertActivity(DataSource dataSource, Activity activity) {
//        try (Connection connection = dataSource.getConnection();
//             PreparedStatement preparedStatement = connection.prepareStatement("insert into activities(start_time, activity_desc, activity_type) values (?, ?, ?)")) {
//            preparedStatement.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
//            preparedStatement.setString(2, activity.getDesc());
//            preparedStatement.setString(3, activity.getType().toString());
//            preparedStatement.executeUpdate();
//        } catch (SQLException se) {
//            throw new IllegalStateException("Connection failed", se);
//        }
//    }
//
//    private Activity selectActivityByPreparedStatement(PreparedStatement preparedStatement) {
//        try (ResultSet resultSet = preparedStatement.executeQuery()) {
//            if (resultSet.next()) {
//                Activity activity;
//                return activity = new Activity(
//                        resultSet.getLong("id"),
//                        resultSet.getTimestamp("start_time").toLocalDateTime(),
//                        resultSet.getString("activity_desc"),
//                        ActivityType.valueOf(resultSet.getString("activity_type")));
//            } else {
//                throw new IllegalArgumentException("Activitiy not found");
//            }
//        } catch (SQLException se) {
//            throw new IllegalStateException("Not found");
//        }
//    }
//
//    public Activity selectActivityById(DataSource dataSource, long id) {
//        try(Connection connection = dataSource.getConnection();
//            PreparedStatement preparedStatement = connection.prepareStatement("select * from activities where id=?")) {
//            preparedStatement.setLong(1, id);
//            return selectActivityByPreparedStatement(preparedStatement);
//        } catch (SQLException se) {
//            throw new IllegalStateException("Wrong input", se);
//        }
//    }
//
//    public List<Activity> selectAllActivities(DataSource dataSource) {
//        List<Activity> result = new ArrayList<>();
//        try(Connection connection = dataSource.getConnection();
//        PreparedStatement preparedStatement = connection.prepareStatement("select * from activities");
//        ResultSet resultSet = preparedStatement.executeQuery()) {
//            while (resultSet.next()) {
//                Activity activity = new Activity(
//                        resultSet.getLong("id"),
//                        resultSet.getTimestamp("start_time").toLocalDateTime(),
//                        resultSet.getString("activity_desc"),
//                        ActivityType.valueOf(resultSet.getString("activity_type")));
//                result.add(activity);
//            }
//        } catch (SQLException se) {
//            throw new IllegalStateException("Can not execute", se);
//        }
//        return result;
//    }

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
//        Activity activity1 = new Activity(LocalDateTime.of(2021,3,2,9,30),"Biking in Mátra", ActivityType.BIKING);
//        Activity activity2 = new Activity(LocalDateTime.of(2021,3,1,10,40),"Hiking in Bakony", ActivityType.HIKING);
//        Activity activity3 = new Activity(LocalDateTime.of(2021,3,2,9,30),"Running in Bükk", ActivityType.RUNNING);

//        ActivityTrackerMain atm = new ActivityTrackerMain();
//        atm.insertActivity(dataSource, activity1);
//        atm.insertActivity(dataSource, activity2);
//        atm.insertActivity(dataSource, activity3);
//        System.out.println(atm.selectActivityById(dataSource, 3));
//        System.out.println(atm.selectAllActivities(dataSource));

//        Flyway flyway = Flyway.configure().dataSource(dataSource).load();
//        flyway.clean();
//        flyway.migrate();

        ActivityDao activityDao = new ActivityDao(dataSource);
//        System.out.println(activityDao.selectActivityById(4));
//        System.out.println(activityDao.selectActivitiesByType(ActivityType.BIKING));
        System.out.println(activityDao.activitiesBeforeDate(LocalDate.of(2021,3,3)));
    }
}

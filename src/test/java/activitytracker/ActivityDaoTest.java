package activitytracker;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ActivityDaoTest {

    private ActivityDao activityDao;

    @BeforeEach
    public void setUp() {
        MariaDbDataSource dataSource;
        try {
            dataSource = new MariaDbDataSource();
            dataSource.setUrl("jdbc:mariadb://localhost:3306/activitytracker?useUnicode=true");
            dataSource.setUser("activitytracker");
            dataSource.setPassword("activitytracker");
        } catch (SQLException se) {
            throw new IllegalStateException("Connection failed", se);
        }
        Flyway flyway = Flyway.configure().dataSource(dataSource).load();
        flyway.clean();
        flyway.migrate();
        activityDao = new ActivityDao(dataSource);
    }

    @Test
    public void insertActivityTest() {
        Activity activity1 = new Activity(LocalDateTime.of(2021,3,2,9,30),"Biking in Mátra", ActivityType.BIKING);
        activityDao.insertActivity(activity1);
        assertEquals(4, activityDao.selectAllActivities().size());
    }

    @Test
    public void selectAllActivitiesTest() {
        assertEquals(3, activityDao.selectAllActivities().size());
    }

    @Test
    public void selectBeforeDateTest() {
        System.out.println(activityDao.activitiesBeforeDate(LocalDate.of(2021,3,3)));
    }

    @Test
    public void findByIdTest() {
        Activity activity = new Activity(LocalDateTime.of(2021,3,2,10,0),"Biking", ActivityType.BIKING);
        Activity result = activityDao.insertActivity(activity);
        assertEquals("Biking", activityDao.selectActivityById(result.getId()).getDesc());
    }

    @Test
    public void insertActivityWithTrackPointsTest() {
        Activity activity = new Activity(LocalDateTime.of(2021,3,3,13,10),"Running", ActivityType.RUNNING);
        activity.addTrackPoints(List.of(
                new TrackPoint(LocalDate.of(2021,3,3), 67, 23),
                new TrackPoint(LocalDate.of(2021,3,3), 68, 22),
                new TrackPoint(LocalDate.of(2021,3,3), 69, 21)));
        Activity activity2 = activityDao.insertActivity(activity);
        System.out.println(activityDao.selectActivityById(activity2.getId()));
    }
}
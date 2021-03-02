package activitytracker;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;
import java.sql.SQLException;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ActivityDaoTest {
    private ActivityDao activityDao;

    @BeforeEach
    void setUp() {
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
    void insertActivityTest() {
        Activity activity1 = new Activity(LocalDateTime.of(2021,3,2,9,30),"Biking in Mátra", ActivityType.BIKING);
        activityDao.insertActivity(activity1);
        assertEquals(4, activityDao.selectAllActivities().size());
    }

    @Test
    void selectAllActivitiesTest() {
        assertEquals(3, activityDao.selectAllActivities().size());
    }
}
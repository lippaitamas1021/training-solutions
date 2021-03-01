package jdbc;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class EmployeesDaoTwoTest {

    private EmployeesDaoTwo employeesDaoTwo;

    @BeforeEach
    public void init() {
        MariaDbDataSource dataSource = new MariaDbDataSource();
        try {
            dataSource.setUrl("jdbc:mariadb://localhost:3306/employees?useUnicode=true");
            dataSource.setUser("employees");
            dataSource.setPassword("employees");
        } catch (SQLException se) {
            throw new IllegalStateException("Can not create connection");
        }
        Flyway flyway = Flyway.configure().dataSource(dataSource).load();
        flyway.clean();
        flyway.migrate();
        EmployeesDaoTwo employeesDaoTwo = new EmployeesDaoTwo(dataSource);
    }

    @Test
    public void testById() {
        long id = employeesDaoTwo.createEmployee("Bill Gates");
        String name = employeesDaoTwo.findEmployeeNameById(id);
        assertEquals("Bill Gates", name);
    }
}
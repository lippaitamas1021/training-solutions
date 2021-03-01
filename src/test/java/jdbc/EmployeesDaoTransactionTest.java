package jdbc;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class EmployeesDaoTransactionTest {

    private EmployeesDaoTransaction employeesDaoTransaction;

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
        EmployeesDaoTransaction employeesDaoTransaction = new EmployeesDaoTransaction();
    }

    @Test
    public void testById() {
        long id = employeesDaoTransaction.createEmployees("Eric Cartman");
        String name = employeesDaoTransaction.findEmployeeNameById(id);
        assertEquals("Eric Cartman", name);
    }

    @Test
    public void testCreateEmployees() {
        employeesDaoTransaction.createEmployees(Arrays.asList("Warren Buffet", "Bill Gates"));
        List<String> names = employeesDaoTransaction.listEmployeeNames();
        assertEquals(Arrays.asList("Warren Buffet", "Bill Gates"), names);
    }

    @Test
    public void testCreateEmployeesRollback() {
        employeesDaoTransaction.createEmployees(Arrays.asList("Warren Buffet", "Bill Gates"));
        List<String> names = employeesDaoTransaction.listEmployeeNames();
        assertEquals(Collections.emptyList(), names);
    }
}
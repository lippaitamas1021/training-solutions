package jdbc;

import org.mariadb.jdbc.MariaDbDataSource;
import java.sql.SQLException;
import java.util.List;

public class EmployeesMain {

    public static void main(String[] args) {
        MariaDbDataSource dataSource = new MariaDbDataSource();
        try {
            dataSource.setUrl("jdbc:mariadb://localhost:3306/employees?useUnicode=true");
            dataSource.setUser("employees");
            dataSource.setPassword("employees");
        } catch (SQLException se) {
            throw new IllegalStateException("Can not create connection");
        }
        EmployeesDao employeesDao = new EmployeesDao(dataSource);
        employeesDao.createEmployee("Warren Buffet");

        List<String> names = employeesDao.listEmployeeNames();
        System.out.println(names);

        String name = employeesDao.findEmployeeNameById(4L);
        System.out.println(name);
    }
}

package jdbc;

import org.mariadb.jdbc.MariaDbDataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
    try (
            Connection connection = dataSource.getConnection();
            PreparedStatement statement = connection.prepareStatement("insert into employees(emp_name) values (?)")) {
        statement.setString(1, "Stewie Griffin");
        statement.executeUpdate();
    } catch (SQLException se) {
        throw new IllegalStateException("Can not insert", se);
    }
    }
}

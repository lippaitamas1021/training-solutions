package jdbc;

import org.mariadb.jdbc.MariaDbDataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FindByIdMain {

    public static void main(String[] args) {
        MariaDbDataSource dataSource = new MariaDbDataSource();
        try {
            dataSource.setUrl("jdbc:mariadb://localhost:3306/employees?useUnicode=true");
            dataSource.setUser("employees");
            dataSource.setPassword("employees");
        } catch (SQLException se) {
            throw new IllegalStateException("Can not create connection");
        }
        new FindByIdMain().selectNameById(dataSource, 2);
    }


    public void selectNameById(MariaDbDataSource dataSource, long id) {
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("select emp_name from employees where id = ?");
        ) {
            preparedStatement.setLong(1, id);
            selectNameByPreparedStatement(preparedStatement);
        } catch (SQLException se) {
            throw new IllegalStateException("Can not query", se);
        }
    }

    public void selectNameByPreparedStatement(PreparedStatement preparedStatement) {
        try (ResultSet resultSet = preparedStatement.executeQuery()) {
            if (resultSet.next()) {
                String name = resultSet.getString("emp_name");
                System.out.println(name);
            }
            throw new IllegalArgumentException("No employee found");
        } catch (SQLException se) {
            throw new IllegalStateException("Can not select", se);
        }
    }
}

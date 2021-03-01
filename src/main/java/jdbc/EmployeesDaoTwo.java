package jdbc;

import javax.sql.DataSource;
import java.sql.*;

public class EmployeesDaoTwo {

    private DataSource dataSource;

    public EmployeesDaoTwo(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public long createEmployee(String name) {
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement("insert into employees(emp_name) values (?)",
                     Statement.RETURN_GENERATED_KEYS)) {
            statement.setString(1, name);
            statement.executeUpdate();
            return getIdByStatement(statement);
        } catch (SQLException se) {
            throw new IllegalStateException("Can not insert", se);
        }
    }

    private long getIdByStatement(PreparedStatement statement) {
        try (ResultSet resultSet = statement.getGeneratedKeys()
        ) {
            if (resultSet.next()) {
                return resultSet.getLong(1);
            } else {
                throw new IllegalStateException("Can not get id");
            }
        } catch (SQLException se) {
            throw new IllegalStateException("Can not get id", se);
        }
    }

    public String findEmployeeNameById(long id) {
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("select emp_name from employees where id = ?");
        ) {
            preparedStatement.setLong(1, id);
            return selectNameByPreparedStatement(preparedStatement);
        } catch (SQLException se) {
            throw new IllegalStateException("Can not query", se);
        }
    }

    private String selectNameByPreparedStatement(PreparedStatement preparedStatement) {
        try (ResultSet resultSet = preparedStatement.executeQuery()) {
            if (resultSet.next()) {
                String name = resultSet.getString("emp_name");
                return name;
            }
            throw new IllegalArgumentException("No employee found");
        } catch (SQLException se) {
            throw new IllegalStateException("Can not select", se);
        }
    }
}

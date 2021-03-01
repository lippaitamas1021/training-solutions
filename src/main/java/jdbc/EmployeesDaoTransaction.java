package jdbc;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeesDaoTransaction {


    private DataSource dataSource;

    public EmployeesDaoTransaction(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void createEmployee(String name) {
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement("insert into employees(emp_name) values (?)")) {
            statement.setString(1, name);
            statement.executeUpdate();
        } catch (SQLException se) {
            throw new IllegalStateException("Can not insert", se);
        }
    }

    public List<String> listEmployeeNames() {
        try (
                Connection conn = dataSource.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT emp_name FROM employees"))
        {
            List<String> names = new ArrayList<>();
            while (rs.next()) {
                String name = rs.getString("emp_name");
                names.add(name);
            }
            return names;
        } catch (SQLException se) {
            throw new IllegalStateException("Can not select", se);
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

    public void createEmployees(List<String> names) {
        try (Connection connection = dataSource.getConnection()) {
            connection.setAutoCommit(false);
            try (PreparedStatement preparedStatement = connection.prepareStatement("insert into employees(emp_name) values (?)")) {
                for (String name : names) {
                    if (name.startsWith("x")) {
                        throw new IllegalArgumentException("Invalid name");
                    }
                    preparedStatement.setString(1, name);
                    preparedStatement.executeUpdate();
            }
            connection.commit();
            } catch (IllegalArgumentException iae) {
                connection.rollback();
            }
        } catch (SQLException se) {
            throw new IllegalStateException("Can not insert", se);
        }
    }
}

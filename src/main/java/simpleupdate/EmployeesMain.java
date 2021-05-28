package simpleupdate;

import org.mariadb.jdbc.MariaDbDataSource;
import java.sql.*;

public class EmployeesMain {

    public static void main(String[] args) {
        MariaDbDataSource dataSource;
        try {
            dataSource = new MariaDbDataSource();
            dataSource.setUrl("jdbc:mariadb://localhost:3306/employees?useUnicode=true");
            dataSource.setUser("employees");
            dataSource.setPassword("employees");
        } catch (SQLException se) {
            throw new IllegalStateException("Can not create data source", se);
        }
//            try (
//                    Connection conn = dataSource.getConnection();
//                    PreparedStatement stmt =
//                            conn.prepareStatement("insert into employees(emp_name) values (?)",
//                                    Statement.RETURN_GENERATED_KEYS)) {
//                stmt.setString(1, "John Doe");
//                stmt.executeUpdate();
//            } catch (SQLException se) {
//                throw new IllegalStateException("Can not insert", se);
//            }
        try (
            Connection conn = dataSource.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT emp_name FROM employees"))
         {
            while(rs.next()) {
                String name = rs.getString("emp_name");
                System.out.println(name);
            }
        } catch (SQLException se) {
            throw new IllegalStateException("Can not select employees", se);
        }
    }
}



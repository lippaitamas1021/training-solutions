package introdate;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee employee = new Employee(1984, 10, 21, "Lippai Tamás");
        System.out.println(employee.getBeginEmployment());
        System.out.println(employee.getDateOfBirth());
    }
}
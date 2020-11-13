package intromethods.employee;

public class EmployeeMain {

    public static void main(String[] args) {
        Employee employee = new Employee("Tamás", 2009, 300000);

        System.out.println(employee);

        employee.raiseSalary(200000);
        System.out.println(employee.getSalary());

        employee.setName("Károly");
        System.out.println(employee.getName());
        System.out.println(employee.getHiringYear());
        System.out.println(employee.getSalary());
        System.out.println(employee);
    }
}

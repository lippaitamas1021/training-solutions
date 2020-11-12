package debug.employees;

import java.util.ArrayList;
import java.util.List;

public class CompanyMain {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Tom Tailor", 1985);
        Employee employee2 = new Employee("Adam Smith", 1978);
        Employee employee3 = new Employee("Mark Sanders", 1988);

        Company company = new Company(new ArrayList<>());

        company.addEmployee(employee1);
        company.addEmployee(employee2);
        company.addEmployee(employee3);

        Employee tom = company.findEmployeeByName("Tom Tailor");
        System.out.println(tom.getName() + " " + tom.getYearOfBirth());

        List<String> names = company.listEmployeeNames();
        System.out.println(names);
    }
}

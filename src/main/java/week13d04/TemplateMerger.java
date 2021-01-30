package week13d04;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class TemplateMerger {

    public String merge(Path file, List<Employee> employees) {
        String template;
        try (BufferedReader bufferedReader = Files.newBufferedReader(file)) {
            template = bufferedReader.readLine();
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read the file", ioe);
        }
        return createString(template, employees);
    }

    public String createString(String template, List<Employee> employees) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Employee employee : employees) {
            String name = employee.getName();
            String yearOfBirth = String.valueOf(employee.getYearOfBirth());
            String employeeString = template.replace("{nev}", name).replace("{ev}", yearOfBirth);
            stringBuilder.append(employeeString).append("\n");
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        Employee employee1 = new Employee("John Doe", 1980);
        Employee employee2 = new Employee("Jack Doe", 1990);
        employees.add(employee1);
        employees.add(employee2);
        TemplateMerger templateMerger = new TemplateMerger();
        Path path = Path.of("employee.txt");
        System.out.println(templateMerger.merge(path, employees));

    }
}

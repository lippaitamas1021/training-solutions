package week13d04;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
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
}

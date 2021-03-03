package timesheet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Company {

    private InputStream employeesFile;
    private InputStream projectsFile;
    private List<Employee> employees = new ArrayList<>();
    private List<Project> projects = new ArrayList<>();
    private List<TimeSheetItem> timeSheetItems = new ArrayList<>();
    private LocalDateTime time;

    public Company(InputStream employeesFile, InputStream projectsFile) {
        this.employeesFile = employeesFile;
        this.projectsFile = projectsFile;
    }

    public void addTimeSheetItem(Employee employee, Project project, LocalDateTime beginDate, LocalDateTime endDate) {
        timeSheetItems.add(new TimeSheetItem(employee, project, beginDate, endDate));
    }

    public List<Employee> getEmployees() {
        try (BufferedReader bufferedReader = Files.newBufferedReader(Path.of("employees.txt"))) {
            String line;
            while((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split(" ");
                String firstName = parts[0];
                String lastName = parts[1];
                Employee employee = new Employee(firstName, lastName);
                employees.add(employee);
            }
            return employees;
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read the file", ioe);
        }
    }

    public List<Project> getProjects() {
        try (BufferedReader bufferedReader = Files.newBufferedReader(Path.of("projects.txt"))) {
            String line;
            while((line = bufferedReader.readLine()) != null) {
                projects.add(new Project(line));
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Failed at reading the file", ioe);
        }
        return projects;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public List<String> calculateProjectByNameYearMonth(String name, int year, int month) {
        List<String> result = new ArrayList<>();
        for (Employee employee : employees) {
            if (!employee.getName().equals(name)) {
                throw new IllegalArgumentException("Employee not found");
            } else {
                for (TimeSheetItem timeSheetItem : timeSheetItems) {
                    if (timeSheetItem.getEmployee().getName().equals(name)) {
                        result.add(name);
                        result.add(String.valueOf(timeSheetItem.hoursBetweenDates()));
                    }
            }
        }
        }
        return result;
    }

    public void printToFile(String name, int year, int month, Path report) {

    }
}

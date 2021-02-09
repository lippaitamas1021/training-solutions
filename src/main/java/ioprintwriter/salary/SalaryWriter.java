package ioprintwriter.salary;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class SalaryWriter {

    private List<String> names;

    public SalaryWriter(List<String> names) {
        this.names = names;
    }

    public void writeNamesAndSalaries(Path file) {
        try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(file))) {
            for (String name : names) {
                writer.print(name);
                writer.print(": ");
                writer.println(decideSalary(name));
        }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);}
    }

    private int decideSalary(String name) {
        if (name.contains("Dr")) {
            return 500_000;
        }
        if (name.contains("Mr") || name.contains("Mrs")) {
            return 200_000;
        } else {
            return 100_000;
        }
    }
}

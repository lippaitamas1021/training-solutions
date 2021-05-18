package hu.nive.ujratervezes.zarovizsga.workhours;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class WorkHours {

    private List<Work> works = new ArrayList<>();

    public String minWork(String fileName) {
        StringBuilder stringBuilder = new StringBuilder();
        String name2 = null;
        int number2 = 0;
        String date2 = null;
        try (BufferedReader bufferedReader = Files.newBufferedReader(Path.of(fileName));) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split(",");
                String name = parts[0];
                int number = Integer.parseInt(parts[1]);
                String date = parts[2];
                works.add(new Work(name, number, date));
            }
            int min = Integer.MAX_VALUE;

            for (Work work : works) {
                if (work.getNumber() < min) {
                    min = work.getNumber();
                    name2 = work.getName();
                    number2 = work.getNumber();
                    date2 = work.getDate();
                }
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read the file", ioe);
        }
        stringBuilder.append(name2);
        stringBuilder.append(": ");
        stringBuilder.append(date2);
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        WorkHours workHours = new WorkHours();
        System.out.println(workHours.minWork("D:\\training\\training-solutions\\src\\test\\resources\\hu.nive.ujratervezes.zarovizsga.workhours\\workhours.txt"));
    }
}


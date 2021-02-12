package week15d04;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CovidStatistics {

    private List<CovidCasesByWeeks> cases = new ArrayList<>();

    public List<CovidCasesByWeeks> getCases() {
        return new ArrayList<>(cases);
    }

    public void readFromFile(BufferedReader br) {
        try {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.contains("Hungary")) {
                    cases.add(processLine(line));
                }
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Failed at reading the file", ioe);
        }
    }

    private CovidCasesByWeeks processLine(String line) {
        String[] temp = line.split(",");
        int numberOfCases = Integer.parseInt(temp[2]);
        return new CovidCasesByWeeks(temp[1], numberOfCases);
    }

    public List<String> findFirstThree() {
        List<CovidCasesByWeeks> sorted = new ArrayList<>(cases);
        Collections.sort(sorted);
        List<String> result = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            result.add(sorted.get(i).getWeek());
        }
        return result;
    }

    public static void main(String[] args) {
        try {
            BufferedReader br = Files.newBufferedReader(Path.of("data.csv"));
            CovidStatistics covidStatistics = new CovidStatistics();
            covidStatistics.readFromFile(br);
            System.out.println(covidStatistics.getCases());
            System.out.println(covidStatistics.findFirstThree());
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read the file", ioe);
        }
    }
}

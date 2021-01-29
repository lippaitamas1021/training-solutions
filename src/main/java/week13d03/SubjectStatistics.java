package week13d03;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class SubjectStatistics {

    private final List<Subject> data = new ArrayList<>();

    public void readFromFile(String fileName) {
    try (BufferedReader bufferedReader = Files.newBufferedReader(Path.of(fileName))) {
        String[] block = new String[4];
        while ((block[0] = bufferedReader.readLine()) != null) {
            data.add(processBlock(bufferedReader, block));
    }
        } catch (IOException ioe) {
        throw new IllegalArgumentException("Can not read the file", ioe);
        }
    }

    private Subject processBlock(BufferedReader bufferedReader, String[] block) throws IOException {
        for (int i = 1; i < 4; i++) {
            block[i] = bufferedReader.readLine();
        }
        return new Subject(block[0], block[1], block[2], Integer.parseInt(block[3]));
    }

    public int weekWork(String name) {
        int sum = 0;
        for (Subject subject : data) {
            if (subject.getName().equals(name)) {
                sum += subject.getNumberOfLessons();
            }
        }
        return sum;
    }
}

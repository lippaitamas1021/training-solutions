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
        String[] block = new String[4];                             // nem egysorban, hanem 4 soros blokkokban van az adat
        while ((block[0] = bufferedReader.readLine()) != null) {
            data.add(processBlock(bufferedReader, block));
    }
        } catch (IOException ioe) {
        throw new IllegalArgumentException("Can not read the file", ioe);
        }
    }

    private Subject processBlock(BufferedReader bufferedReader, String[] block) throws IOException {
        for (int i = 1; i < 4; i++) {                           // i = 1, mert a nulladik elemet már beolvastam
            String line;
            if ((line = bufferedReader.readLine()) != null) {
                block[i] = line;
            }
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

    public int sumLessonsOfTeacher(String file, String teacherName) {
        int sum = 0;
        try (BufferedReader bufferedReader = Files.newBufferedReader(Path.of(file))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.equals(teacherName)) {
                    skipTwoLines(bufferedReader);
                    sum += Integer.parseInt(bufferedReader.readLine());
                }
            }
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Wrong file", ioe);
        }
        return sum;
    }

    public void skipTwoLines(BufferedReader bufferedReader) throws IOException {
        bufferedReader.readLine();
        bufferedReader.readLine();
    }

    public static void main(String[] args) {
        SubjectStatistics subjectStatistics = new SubjectStatistics();
        subjectStatistics.readFromFile("D:\\training\\training-solutions\\beosztas.txt");
        System.out.println(subjectStatistics.weekWork("Csincsilla Csilla"));
        System.out.println(subjectStatistics.sumLessonsOfTeacher("beosztas.txt", "Albatrosz Aladin"));
    }
}

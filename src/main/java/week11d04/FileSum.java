package week11d04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileSum {

    public int readFile(String name) {
        Path file = Path.of(name);
        try {
            String content = Files.readString(file);
            int number = Integer.parseInt(content);
            return number;
        } catch (IOException e) {
            throw new IllegalStateException("Wrong file", e);
        }
    }

    public int sumNumbers () {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            String fileName = "number" + (i < 10 ? "0" + i : i) + ".txt";
            System.out.println(fileName);

            if (Files.isRegularFile(Path.of(fileName))) {
                System.out.println("found");
                int number = readFile(fileName);
                sum += number;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        //System.out.println(new FileSum().readFile("number20.txt"));
        System.out.println(new FileSum().sumNumbers());
    }

}

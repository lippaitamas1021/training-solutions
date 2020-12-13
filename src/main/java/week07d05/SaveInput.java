package week07d05;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SaveInput {

    private List<String> readLine() {
        List<String> lines = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i < 4; i++) {
            System.out.println("Add meg a " + i + ". sort");
            String line = scanner.nextLine();
            lines.add(line);
        }
        return lines;
    }

    private Path readFilename() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add meg a fájnevet");
        String filename = scanner.nextLine();
        Path path = Path.of(filename);
        return path;
    }

    private void write(Path path, List<String> lines) {
        try {
            Files.write(path, lines);
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Can not write the file", ioe);
        }
    }

    public static void main(String[] args) {
        SaveInput saveInput = new SaveInput();
        List<String> lines = saveInput.readLine();
        Path file = saveInput.readFilename();

        saveInput.write(file, lines);
    }
}

package iowritestring.school;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Register {

    public void newMark(Path file, int i) {
        try {
            if (Files.exists(file)) {
                Files.writeString(file, Integer.toString(i) + "\n", StandardOpenOption.APPEND);
            } else {
                Files.writeString(file, Integer.toString(i));
            }
            } catch (IOException e) {
            throw new IllegalStateException("Can not find the file", e);
        }
    }


    public void average(Path file) {
        try {
            List<String> myFile = Files.readAllLines(file);
            double sum = 0;
            for (String s : myFile) {
                sum += Double.parseDouble(s);
            }
            Files.writeString(file, "average: " + (sum / myFile.size()), StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new IllegalStateException("Can't open file", e);
        }
    }
}

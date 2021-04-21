package hu.nive.ujratervezes.zarovizsga.countchars;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DaVinciCode {

    public int encode(String input, char c) {
        isParamSuitable(c);
        int counter = 0;
            try (BufferedReader bufferedReader = Files.newBufferedReader(Path.of(input))) {
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    for (char e : line.toCharArray()) {
                        if (e == c) {
                            counter++;
                        }
                    }
                }
            } catch (IOException ioe) {
                throw new IllegalArgumentException("Can not read the file: " + input);
            }
        return counter;
    }

    private boolean isParamSuitable(char c) {
        if (String.valueOf(c).equals("0") || String.valueOf(c).equals("1") || String.valueOf(c).equals("x")) {
            return true;
        } else {
            throw new IllegalArgumentException("Wrong parameter: " + c);
        }
    }
}

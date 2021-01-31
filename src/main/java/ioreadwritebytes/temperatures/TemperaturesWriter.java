package ioreadwritebytes.temperatures;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class TemperaturesWriter {

    public void writeTemperatures(Temperatures temperatures, String pathString) {
        Path path = Path.of(pathString);
        try {
            Files.write(path, temperatures.getData());

        } catch (IOException ioe) {
            throw new IllegalStateException("Can not find the file", ioe);
        }
    }
}
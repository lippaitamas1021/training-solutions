package temperatures;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TemperaturesReader {


    public Temperatures readTemperatures(String pathString) {
        Path path = Path.of(pathString);
        try {
            byte[] data = Files.readAllBytes(path);
            return new Temperatures(data);
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Can not read the file, ioe");
        }
    }
}

package week14d05;

import org.junit.jupiter.api.Test;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class HachikoTest {

    @Test
    void countWords() throws IOException {
        try (BufferedReader reader = Files.newBufferedReader(Path.of("hachiko.txt"))) {
            Map<String, Integer> result = new Hachiko().countWords(reader, "Hachiko", "haza", "pályaudvar", "jó");
            assertEquals(16, result.get("haza"));
        }
    }
}
package week13d01;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class CityOperationsTest {

    @Test
    void findCityWithMaxLengthTEst() throws IOException {
        CityOperations cityOperations = new CityOperations();
        BufferedReader bufferedReader = Files.newBufferedReader(Path.of("iranyitoszamok.txt"));
        assertEquals("Jászfelsőszentgyörgy", cityOperations.findCityWithMaxLength(bufferedReader));
    }
}
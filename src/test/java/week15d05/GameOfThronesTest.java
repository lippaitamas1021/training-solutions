package week15d05;

import org.junit.jupiter.api.Test;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class GameOfThronesTest {

    @Test
    void getHouseTest() throws IOException {
        BufferedReader reader = Files.newBufferedReader(Path.of("battles.txt"));
        GameOfThrones gameOfThrones = new GameOfThrones();
        assertEquals("Lannister", gameOfThrones.getHouse(reader));
    }
}
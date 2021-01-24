package week12d05;

import org.junit.jupiter.api.Test;
import java.nio.file.Path;
import static org.junit.jupiter.api.Assertions.*;

class CovidTest {

    @Test
    void wordCounterTest() {
        Path file = Path.of("index.html");      // InputStream is = CovidTest.class.getResourceAsStream("/index.html");
        Covid covid = new Covid();                  //
        int counter = covid.wordCounter("koronavírus", file);
        assertEquals(11, counter);
    }
}
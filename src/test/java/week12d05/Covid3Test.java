package week12d05;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;

import static org.junit.jupiter.api.Assertions.*;

class Covid3Test {

    @Test
    void testWordCounter() {                                                                              // Path-t és InputStream()-et is be tud olvasni
        //Path path = Path.of("src/main/resources/index.html");                                           // tesztesetben kötelező a getResourceAsStream()-et használni a Path.of helyett
        InputStream is = Covid3.class.getResourceAsStream("/index.html");                           // InputStream()-et ad vissza
        Covid3 covid3 = new Covid3();                                                                     // InputStream()-et nem lehet path-szá alakítani
        int n = covid3.wordCounter(new BufferedReader(new InputStreamReader(is)), "koronavírus");    // a metódus paraméterét Path path-ról BufferedReader bufferedreader-ré kell alakítani
        assertEquals(11, n);
    }

    @Test
    void searchInMemoryTest() {                                                 // nem fájlt adtunk át, nem path-t adtunk át, hanem bufferedreader-t
        BufferedReader bufferedReader = new BufferedReader(new StringReader("alma\nkörte\nmeggy\nalma\nalma"));
        Covid3 covid3 = new Covid3();                                           // így a program jobban felhasználható, mert be tud olvasni fájlt, fájlt classpath-ról és String-et is, de akár url-t is
        int n = covid3.wordCounter(bufferedReader, "alma");
        assertEquals(3, n);
    }
}
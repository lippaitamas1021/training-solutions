package week13d05;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LetterTest {

    @Test
    void letterCounterTest() {
        Letter letter = new Letter(97, 122);
        assertEquals(8, letter.letterCounter("interface"));
    }

    @Test
    void counterTest() {
        Letter letter = new Letter(97, 122);
        assertEquals(10, letter.counter("konkatenáció"));
    }

    @Test
    void characterCounterTest() {
        Letter letter = new Letter(97, 122);
        assertEquals(7, letter.characterCounter("konstruktor"));
    }

    @Test
    void uniqueLetterCounterTest() {
        Letter letter = new Letter(97, 122);
        assertEquals(9, letter.uniqueLetterCounter("komplementer"));
    }

    @Test
    void countDifferentLettersTest() {
        Letter letter = new Letter(97, 122);
        assertEquals(9, letter.countDifferentLetters("inicializátor"));
    }

    @Test
    void letterCounter2Test() {
        Letter letter = new Letter(97, 122);
        assertEquals(9, letter.letterCounter2("multiplikatív"));
    }
}
package week05d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChangeLetterTest {

    @Test
    void testChangeLetter() {
        assertEquals("*rv*zt*r*", new ChangeLetter().changeVowels("arvizturo"));
    }
}

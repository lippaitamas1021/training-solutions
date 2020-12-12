package week07d04;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

public class LabTest {

    @Test
    public void testConstructor() {
        Lab lab = new Lab("Metódus túlterhelés");
        assertEquals("Metódus túlterhelés", lab.getTitle());
        assertFalse(lab.isCompleted());
        assertEquals(null, lab.getCompletedAt());
    }

    @Test
    public void testConstructorWithParameter() {
        Lab lab = new Lab("Metódus túlterhelés", LocalDate.of(2020,12,10));
        assertEquals("Metódus túlterhelés", lab.getTitle());
        assertTrue(lab.isCompleted());
        assertEquals(LocalDate.of(2020,12,10), lab.getCompletedAt());
    }

    @Test
    public void testCompleteWithParameter() {
        Lab lab = new Lab("Metódus túlterhelés");
        lab.complete(LocalDate.of(2020,12,10));
        assertTrue(lab.isCompleted());
        assertEquals(LocalDate.of(2020,12,10), lab.getCompletedAt());
    }

    @Test
    public void testComplete() {
        Lab lab = new Lab("Metódus túlterhelés");
        lab.complete();                                             // éjfélkor hibát kapunk
        assertTrue(lab.isCompleted());
        assertEquals(LocalDate.now(), lab.getCompletedAt());        // LocalDateTime-mal nem működik
    }

    @Test
    public void testIsTitleLongerThanTwoCharacters() {
        Lab lab = new Lab("abc");
        boolean result = lab.isTitleLongerThanTwoCharacters();
        assertTrue(result);
    }

    @Test
    public void testIsTitleShorterThanTwoCharacters() {
        Lab lab = new Lab("a");
        boolean result = lab.isTitleLongerThanTwoCharacters();
        assertFalse(result);
    }

    @Test
    public void testTitleAndCompleted() {
        Lab lab = new Lab("oop");
        String signs = "x-";
        String result = lab.titleAndCompleted(Character.toString((signs.charAt(0))), Character.toString(signs.charAt(1)));
        assertEquals("oop -", result);
        // assertEquals("oop -", lab.titleAndCompleted(Character.toString((signs.charAt(0))), Character.toString(signs.charAt(1))););
    }
}

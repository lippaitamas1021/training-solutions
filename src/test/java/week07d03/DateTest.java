package week07d03;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DateTest {

    @Test
    public void loopYearTest() {
        Date date1 = new Date(2019, 10, 21);
        assertFalse(date1.leapYear(2019));
        assertEquals(true, date1.leapYear(2020));
    }
}

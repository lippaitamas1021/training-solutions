package week12d03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberStatTest {

    @Test
    void findSmallestOneTest() {
    NumberStat numberStat = new NumberStat();
    numberStat.readFromFile("numberstat.txt");

    Exception exception = assertThrows(IllegalStateException.class, () -> numberStat.findSmallestOne());
    assertEquals("List is empty", exception.getMessage());
    }
}
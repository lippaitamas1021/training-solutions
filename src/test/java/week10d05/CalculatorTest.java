package week10d05;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void findMinSumTest() {
          assertEquals(10, new Calculator().findMinSum(new int[]{1, 2, 3, 4, 5, 6}));
    }
    
    @Test
    void CalculatorToSmallListTest() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> new Calculator().findMinSum(new int[]{}));
        assertEquals("The array is empty", exception.getMessage());
    }
}


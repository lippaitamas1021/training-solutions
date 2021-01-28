package recursion;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialCalculatorTest {

    @Test
    public void simplestCase() {
        int number = 1;
        long actual = new FactorialCalculator().getFactorial(number);
        assertEquals(1L, actual);
    }

    @Test
    public void greaterNumber() {
        int number = 5;
        long actual = new FactorialCalculator().getFactorial(number);
        assertEquals(120L, actual);
    }
}

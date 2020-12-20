package week08d05;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathAlgorithmsTest {

    @Test
    public void mathAlgorithmsTest() {
        MathAlgorithms ma = new MathAlgorithms();
        assertEquals(3, ma.greatestCommonDivisor(21,18));
    }
}

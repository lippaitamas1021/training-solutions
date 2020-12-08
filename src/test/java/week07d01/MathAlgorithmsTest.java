package week07d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MathAlgorithmsTest {

    @Test
    public void isPrimeTest() {
        assertFalse(MathAlgorithms.isPrime(1));
        assertFalse(MathAlgorithms.isPrime(4));
        assertTrue(MathAlgorithms.isPrime(2));
        assertTrue(MathAlgorithms.isPrime(23));
        assertEquals(false, MathAlgorithms.isPrimeOtherWay(16));
    }
}

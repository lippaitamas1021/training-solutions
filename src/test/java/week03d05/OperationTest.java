package week03d05;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OperationTest {

    @Test
    void getResultTest() {
        assertEquals(80, new Operation(68,12).getResult());
    }
}
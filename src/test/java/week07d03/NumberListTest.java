package week07d03;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

public class NumberListTest {

    @Test
    public void isIncreasingTest() {
        NumberList numberList = new NumberList();

        assertEquals(true, numberList.isIncreasing(Arrays.asList(1, 2, 3, 4, 5)));
        assertEquals(true, numberList.isIncreasing(Arrays.asList(1, 2, 3, 3, 3, 5)));
        assertEquals(false, numberList.isIncreasing(Arrays.asList(1, 2, 1, 2, 3, 2)));
    }

}

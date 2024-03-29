package issorted;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SorterTest {

    @Test
    public void isSortedTest(){
        assertEquals(false,Sorter.isSorted(new double[]{22.2,16.1,14.3,12.1}));
        assertEquals(true,Sorter.isSorted(new double[]{1.5,4.3,7.0,19.5,25.1,46.2}));
        assertEquals(true,Sorter.isSorted(new double[]{1.5,1.5,4.3,7.0,19.5,25.1,46.2}));
        assertEquals(true,Sorter.isSorted(new double[]{1.5}));
    }

}

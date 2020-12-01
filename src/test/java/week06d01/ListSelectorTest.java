package week06d01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class ListSelectorTest {

    ListSelector listSelector = new ListSelector();

    @Test
    public void getEvenIndexElementsTest() {
        Assertions.assertEquals("[almabarack]", listSelector.getEvenIndexElements(Arrays.asList("alma", "körte", "barack")));
    }

    @Test
    public void getEvenIndexElementsWithNull() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> listSelector.getEvenIndexElements(null));
    }

    @Test
    public void getEvenIndexElementsWithEmptyList() {
        Assertions.assertEquals("", listSelector.getEvenIndexElements(new ArrayList<>()));
    }

}

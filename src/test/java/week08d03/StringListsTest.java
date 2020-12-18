package week08d03;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

public class StringListsTest {

    @Test
    public void unionTest() {
        List<String> first = Arrays.asList("a", "b", "c");
        List<String> second = Arrays.asList("a", "d");
        StringLists s1 = new StringLists();

        assertEquals(Arrays.asList("a", "b", "c", "d"), s1.stringListsUnion(first, second));

    }
}

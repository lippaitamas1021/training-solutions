package week11d03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordFilterTest {

    @Test
    void wordsWithCharTest() {
        WordFilter wordFilter = new WordFilter();
        List<String> list1 = new ArrayList<>();
        list1.add("alma");
        list1.add("ananász");
        list1.add("banán");
        list1.add("dió");
        list1.add("mogyoró");
        list1.add("narancs");

        assertEquals(List.of("narancs"), wordFilter.wordsWithChar(list1, 'c'));
        assertEquals(Arrays.asList("alma", "ananász", "banán", "narancs"), wordFilter.wordsWithChar(list1, 'a'));

    }
}
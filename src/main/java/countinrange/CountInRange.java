package countinrange;

import java.util.ArrayList;
import java.util.List;

public class CountInRange {

    public int countInRange(int[] numbers, int min, int max) {
        List<Integer> result = new ArrayList<>();
        for (int i : numbers) {
            if (min < i && i < max) {
                result.add(i);
            }
        }
        return result.size();
    }
}

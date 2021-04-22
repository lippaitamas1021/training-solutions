package lastindexof;

import java.util.ArrayList;
import java.util.List;

public class LastIndexOf {

    public int lastIndexOf(int[] numbers, int number) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == number) {
                result.add(i);
            }
        }
        if (result.isEmpty()) {
            return -1;
        } else {
            return result.get(result.size()-1);
        }
    }
}

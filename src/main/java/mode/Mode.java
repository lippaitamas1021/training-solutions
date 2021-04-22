package mode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mode {

    public int mode(int[] numbers) {
        if (numbers.length == 1) {
            return numbers[0];
        }
        List<Integer> result = new ArrayList<>();
        for (int i : numbers) {
            if (0 <= i && i <= 100) {
                result.add(i);
            } else {
                throw new IllegalArgumentException("Invalid number");
            }
        }
        Collections.sort(result);
        int mostOften = 0;
        for (int i = 1; i < result.size(); i++) {
            if (result.get(i-1) == result.get(i)) {
                mostOften = result.get(i);
            }
        }
        return mostOften;
    }
}

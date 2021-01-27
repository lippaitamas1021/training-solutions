package algorithmsmax.integers;

import java.util.List;

public class IntegerMaxCalculator {
    public int max(List<Integer> integers) {
        int maxValue = Integer.MIN_VALUE;
        for (Integer integer : integers) {
            if (maxValue < integer) {
                maxValue = integer;
            }
        }
        return maxValue;
    }
}

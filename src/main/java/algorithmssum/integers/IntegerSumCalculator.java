package algorithmssum.integers;

import java.util.List;

public class IntegerSumCalculator {

    public int sum(List<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return sum;
    }
}

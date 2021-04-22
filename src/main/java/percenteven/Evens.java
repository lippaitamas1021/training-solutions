package percenteven;

import java.util.ArrayList;
import java.util.List;

public class Evens {

    public double percentEven(int[] numbers) {
        if (numbers.length == 0) {
            return 0.0;
        }
        List<Double> evenNumbers = new ArrayList<>();
        for (int i : numbers) {
            if (i % 2 ==0) {
                evenNumbers.add((double) i);
            }
        }
        if (evenNumbers.isEmpty()) {
            return 0.0;
        }
        return ((double) evenNumbers.size() / numbers.length) * 100;
    }
}

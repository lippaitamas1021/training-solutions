package algorithmsdecision.integers;

import java.util.List;

public class IntegerDecisionMaker {
    public boolean containsGreaterThan(List<Integer> numbers, int i) {
        for (Integer number : numbers) {
            if (i < number) {
                return true;
            }
        }
        return false;
    }

    public boolean containsLowerThan(List<Integer> numbers, int i) {
        for (Integer number : numbers) {
            if (number < i) {
                return true;
            }
        }
        return false;
    }
}

package isunique;

import java.util.HashSet;
import java.util.Set;

public class Unique {

    public boolean isUnique(int[] numbers) {
        boolean answer;
        Set<Integer> result = new HashSet<>();
        for (int i : numbers) {
            result.add(i);
        }
        answer = result.size() == numbers.length;
        return answer;
    }
}

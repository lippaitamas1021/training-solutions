package kthlargest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KthLargest {

    public int kthLargest(int[] numbers, int k) {
        List<Integer> result = new ArrayList<>();
        for (int i : numbers) {
            result.add(i);
        }
        Collections.sort(result);
        return result.get(result.size()-k-1);
    }
}

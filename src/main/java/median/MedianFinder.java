package median;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MedianFinder {

    public double median(int[] numbers) {
        List<Integer> result = new ArrayList<>();
        for (int i : numbers) {
            result.add(i);
        }
        Collections.sort(result);
        if (result.size() % 2 != 0) {
            return result.get(((result.size()-1)/2));
        } else {
            return ((result.get(result.size()/2-1) + (result.get(result.size()/2))) / 2.0);
        }
    }
}

package append;

import java.util.ArrayList;
import java.util.List;

public class App {

    public int[] append(int[] numbers1, int[] numbers2) {
        List<Integer> result = new ArrayList<>();
        for (int i : numbers1) {
            result.add(i);
        }
        for (int j : numbers2) {
            result.add(j);
        }
        int[] numbers3 = new int[result.size()];
        for (int k = 0; k < result.size(); k++) {
            numbers3[k] = result.get(k);
        }
        return numbers3;
    }
}

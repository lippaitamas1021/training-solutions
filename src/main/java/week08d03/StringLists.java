package week08d03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringLists {

    public List<String> stringListsUnion(List<String> first, List<String> second) {
        List<String> result = new ArrayList<>(first);

        for (String s : second) {
            if (!result.contains(s)) {
                result.add(s);
            }
        }
        Collections.sort(result);
        return result;
    }
}

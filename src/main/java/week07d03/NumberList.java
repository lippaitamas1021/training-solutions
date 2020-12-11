package week07d03;

import java.util.List;

public class NumberList {

    public boolean isIncreasing(List<Integer> testList) {

        for (int i = 1; i < testList.size(); i++) {         // 1-től kell indulnia, mert sz i - 1. elemre hivatkozunk
            if (testList.get(i - 1) > testList.get(i)) {
                return false;
            }
        }
        return true;
    }

}

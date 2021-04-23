package priceisright;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Auction {

    public int priceIsRight(int[] bids, int price) {
        List<Integer> result = new ArrayList<>();
        for (int i : bids) {
            if (i < price) {
                result.add(i);
            }
        }
        if (result.isEmpty()) {
            return -1;
        }
        if (result.size() == 1) {
            return result.get(0);
        }
        Collections.sort(result);
        return result.get(result.size()-1);
    }
}

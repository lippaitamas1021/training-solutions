package methodoverloading.pub;

import java.util.List;

public class ListOfGoodPubs {

    private List<Pub> goodPubs;

    public ListOfGoodPubs(List<Pub> goodPubs) {
        if (goodPubs == null || goodPubs.isEmpty()) {
            throw new IllegalArgumentException("Wrong parameter!");
        }
        this.goodPubs = goodPubs;
    }

    public Pub findTheBest() {
        Pub bestPub = goodPubs.get(0);
        for (int i = 1; i < goodPubs.size(); i++) {
            if (goodPubs.get(i).getOpeningTime().isEarlier(bestPub.getOpeningTime())) {
                bestPub = goodPubs.get(i);
            }
        }
        return bestPub;
    }

}

package week10d01;

import java.util.List;
public class Hiking {

    public double getPlusElevation(List<Double> heights) {
        if (heights == null) {
            throw new IllegalArgumentException("List is empty");
        }
        double sum = 0;
        for (int i = 1; i < heights.size(); i++) {
            if (heights.get(i-1) < heights.get(i)) {
                sum += heights.get(i) - heights.get(i -1);
            }
        }
        return sum;
    }
}

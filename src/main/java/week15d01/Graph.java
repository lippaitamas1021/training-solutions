package week15d01;

import java.util.Map;

public class Graph {
    
    public Map.Entry<Double, Double> maxValueEntry(Map<Double, Double> graphOfFunction) {
        if (graphOfFunction.size() == 0) {
            throw new IllegalArgumentException("Wrong parameter");
        }
        Map.Entry<Double, Double> result = null;
        //double max = Double.MIN_VALUE;

        for (Map.Entry<Double, Double> entry : graphOfFunction.entrySet()) {
            if (result == null || result.getValue() < entry.getValue()) {
                result = entry;
                //max = entry.getValue();
            }
        }
        return result;
    }
}

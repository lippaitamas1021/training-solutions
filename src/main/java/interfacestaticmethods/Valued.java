package interfacestaticmethods;

import java.util.List;

public interface Valued {

    public abstract double getValue();

    public static double totalValue(List<Valued> items) {
        double totalValue = 0;
        for (Valued item : items) {
            totalValue += item.getValue();
        }
        return totalValue;
    }
}

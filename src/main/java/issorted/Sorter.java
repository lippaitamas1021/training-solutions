package issorted;

public class Sorter {

    public static boolean isSorted(double[] doubles) {
        boolean isIncreasing = false;
        if (doubles.length == 1) {
            return true;
        }
        for (int i = 0; i < doubles.length - 1; i++) {
            if (doubles[i] < doubles[i + 1]) {
                isIncreasing = true;
            }
        }
        return isIncreasing;
    }
}


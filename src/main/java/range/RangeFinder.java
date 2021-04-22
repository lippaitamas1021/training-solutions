package range;

public class RangeFinder {

    public static int range(int[] numbers) {
        int max = 0;
        for (int i : numbers) {
            if (max < i) {
                max = i;
            }
        }
        int min = Integer.MAX_VALUE;
        for (int j : numbers) {
            if (j < min) {
                min = j;
            }
        }
        return max - min + 1;
    }
}

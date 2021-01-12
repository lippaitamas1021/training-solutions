package week10d02;
;
import java.util.List;

public class MaxTravel {

    public int getMaxIndex(List<Integer> numbers) {
        int[] counters = count(numbers);
        return max(counters);
    }

    private int[] count(List<Integer> numbers) {
        int[] counters = new int[30];
        for (int i : numbers) {
            counters[i]++;
        }
        return counters;
    }

    private int max(int[] counters) {
        int index = 0;
        for (int i = 1; i < counters.length; i++) {
            if (counters[index] < counters[i]) {
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int max = new MaxTravel().getMaxIndex(List.of(12, 12, 0, 3, 4, 4, 12));
        System.out.println(max);
    }
}

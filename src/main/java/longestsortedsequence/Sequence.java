package longestsortedsequence;

public class Sequence {

    public int longestSortedSequence(int[] numbers) {
        if (numbers.length == 0) {
            return 0;
        }
        int counter = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] <= numbers[i + 1]) {
                counter++;
            } else {
                if (max < counter) {
                    max = counter;
                }
                counter = 0;
            }
        }
        return max + 1;
    }
}

package mingap;

public class Gap {

    public int minGap(int[] numbers) {
        int minGap = Integer.MAX_VALUE;
        if (numbers.length == 0 || numbers.length == 1) {
            minGap = 0;
        }
        for (int i = 1; i < numbers.length; i++) {
            if ((numbers[i] - numbers[i-1]) < minGap) {
                minGap = (numbers[i] - numbers[i-1]);
            }
        }
        return minGap;
    }
}
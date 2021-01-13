package week10d05;

import java.util.Arrays;

public class Calculator {

    public int findMinSum(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("No array given");
        }
        if (arr.length < 1) {
            throw new IllegalArgumentException("The array is empty");
        }
        Arrays.sort(arr);
        int arrLength = Math.min(arr.length, 4);
        int sum = 0;

        for (int i = 0; i < arrLength; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.findMinSum(new int[]{1, 2, 3, 4, 5, 6});
    }
}

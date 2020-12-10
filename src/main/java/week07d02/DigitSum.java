package week07d02;

public class DigitSum {


    public int sumOfDigits(int x) {
        x = Math.abs(x);
        int sum = 0;
        while (x != 0) {
            sum += x % 10;      // 3 + 2 + 1
            x = x / 10;
        }
        return sum;
    }
}



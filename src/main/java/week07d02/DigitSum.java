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

    public int sumDigits(int num) {
        int result = 0;
        String digits = String.valueOf(num);
        for (int i = 0; i < digits.length(); i++) {
            digits.charAt(i);
        }
        return result;
    }
    
}





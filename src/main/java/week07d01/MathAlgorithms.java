package week07d01;

public class MathAlgorithms {

    public static boolean isPrime(int x) {
        if (x < 1) {
            throw new IllegalArgumentException("Wrong parameter");
        }
        int divisors = 0;           //Ha a divisors = 0, akkor i = 1, a lényeg, hogy eggyel nagyobb az i, mint a divisors
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                divisors++;
            }
        }
        if (divisors == 2) {
            return true;
        }
        return false;
    }

    public static boolean isPrimeOtherWay(int x) {
        if (x < 1) {
            throw new IllegalArgumentException("Wrong parameter");
        }
        if (x == 1 || x % 2 ==0) {
            return false;
        }
        if (x == 2) {
            return true;
        }

        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {               // Ha találok osztót, akkor false-szal vissza is térek
                return false;
            }
        }
        return true;
    }
}
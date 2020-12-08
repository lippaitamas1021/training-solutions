package week07d01;

import jdk.swing.interop.SwingInterOpUtils;

public class Fibonacci {

    public static long fib(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Counter can not be less than 0");
        }
        if (n == 0) {       //mehetnének a feltételek else ágba is, hiszen nincs olyan eset, hogy egyszerre több is teljesül
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib(n - 2) + fib(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(fib(5));     // 0 1 1 2 3 5 8 13
        System.out.println(fib(7));
    }
}

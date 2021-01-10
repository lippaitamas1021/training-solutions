package week08d05;

import java.util.Scanner;

public class MathAlgorithms {

 /*   public int greatestCommonDivisor(int x, int y) {
        while (x != y) {
            if (x > y) x -= y;
            else y -= x;
        }
        return x;
    }

    pubic int greatestCommonDivisor(int x, int y) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
        }
      return a;
  */

    public int greatestCommonDivisor(int x, int y) {
        int z = 1;
        for (int i = 2; i <= Math.min(x, y); i++) {
            if (x % i == 0 && y % i == 0) {
                z = i;
            }
        }
        return z;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Két szám legnagyobb közös osztójának kiszámítása:");

        System.out.println("Kérem az első számot:");
        int x = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Kérem a második számot:");
        int y = scanner.nextInt();
        scanner.nextLine();

        MathAlgorithms mathAlgorithms = new MathAlgorithms();
        System.out.println("A két megadott szám legnagyobb közös osztója: " + mathAlgorithms.greatestCommonDivisor(x, y));
    }
}

package introcontrol;

import java.util.Scanner;

public class Qualifier {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem, adjon meg egy számot1 és 1000 között:");
        int Num1 = scanner.nextInt();

        if (Num1 > 100) {
            System.out.println("Az Ön által megadott szám nagyobb, mint 100.");
        }  else {
            System.out.println("Az Ön által megadott szám kisebb, mint 100.");
        }
    }
}

package week04d03;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            Random random = new Random();
            int number1 = random.nextInt(101);
            System.out.println("Kérem, adjon meg egy számot 1 és 100 között:");
            int number2 = scanner.nextInt();
            scanner.nextLine();
            if (number1 < number2) {
                System.out.println(number1);
                System.out.println("Az Ön által választott szám nagyobb!");
            } else {
                System.out.println(number1);
                System.out.println("Az általam választott szám nagyobb!");
            }
        }
    }
}

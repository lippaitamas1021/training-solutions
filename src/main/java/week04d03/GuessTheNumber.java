package week04d03;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        Random random = new Random();
        int number1 = random.nextInt(101);
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 7; i++) {
            System.out.println("Kérem, adjon meg egy számot 1 és 100 között:");
            int number2 = scanner.nextInt();
            scanner.nextLine();
            if (number1 == number2) {
                System.out.println("Ön eltaláta az általam véletlenszerűen választott számot!");
                System.out.println(number1);
                return;
            } if (number1 < number2) {
                System.out.println("Az Ön által választott szám nagyobb!");
            } else {
                System.out.println("Az általam választott szám nagyobb!");
            }
            }
        System.out.println("Az általam véletlenszerűen választott szám: " + number1);
        }
    }


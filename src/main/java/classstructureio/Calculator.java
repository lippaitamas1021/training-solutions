package classstructureio;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem, adjon meg egy egész számot 1 és 100 között.");
        int numOne = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Kérem, adjon meg még egy egész számot 1 és 100 között.");
        int numTwo = scanner.nextInt();
        scanner.nextLine();

        System.out.println(numOne + "+" + numTwo);
        System.out.println(numOne + numTwo);
    }
}
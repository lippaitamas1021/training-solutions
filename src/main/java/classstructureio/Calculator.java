package classstructureio;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem az első számot.");
        int numOne = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Kérem a második számot.");
        int numTwo = scanner.nextInt();
        scanner.nextLine();

        System.out.println(numOne + "+" + numTwo);
        System.out.println(numOne + numTwo);
    }
}

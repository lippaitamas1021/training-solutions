package classstructureio;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem az első számot");
        int megad1 = scanner.nextInt();
        System.out.println("Kérem a második számot");
        int megad2 = scanner.nextInt();
        System.out.println(megad1 + "+" + megad2);
        System.out.println(megad1 + megad2);
    }
}

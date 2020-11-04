package classstructureattributes;

import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem, adja meg a nevét.");
        String name = scanner.nextLine();

        System.out.println("Kérem, adja meg a születési évét.");
        int year = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Kérem, adja meg a címét.");
        String address = scanner.nextLine();

        System.out.println("Név: " + name + ", Születési év: " + year + ", Cím: " + address);
    }
}

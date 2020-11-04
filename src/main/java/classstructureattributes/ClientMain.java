package classstructureattributes;

import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        ClientMain client1 = new ClientMain();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem, adja meg a nevét.");
        String name = scanner.nextLine();

        System.out.println("Kérem, adja meg a születési évét.");
        int year = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Kérem, adja meg a címét");
        String address = scanner.nextLine();


        System.out.println("Regisztrációs adatok: Név: " + name + ", Születési év: " + year + ", Cím: " + address);
    }
}

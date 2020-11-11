package introcontrol;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem, adjon meg 5 tetszőleges számot!");
        System.out.println("Első szám:");

        int numChoosen1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Második szám:");
        int numChoosen2 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Harmadik szám:");
        int numChoosen3 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Negyedik szám:");
        int numChoosen4 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ötödik szám:");
        int numChoosen5 = scanner.nextInt();
        scanner.nextLine();

        int totalSum = numChoosen1 + numChoosen2 + numChoosen3 + numChoosen4 + numChoosen5;

        System.out.println("Az 5 szám összege = " + totalSum);

    }
}

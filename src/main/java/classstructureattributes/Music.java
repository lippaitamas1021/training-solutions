package classstructureattributes;

import java.util.Scanner;

public class Music {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem, adja meg a kedvenc dalának előadóját.");
        String band = scanner.nextLine();

        System.out.println("Kérem, adja meg a kedvenc dalának címét");
        String title = scanner.nextLine();

        System.out.println("Kérem, adja meg a kedvenc dalának hosszát másodpercben.");
        int length = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Szerző: " + band + ", " + title + ", (" + length + " mp)");
    }
}

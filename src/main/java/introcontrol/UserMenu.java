package introcontrol;

import java.util.Scanner;

public class UserMenu {

    public static void main(String[] args) {

        System.out.println("1. Felhasználók listázása");
        System.out.println("2. Felhasználó felvétele");
        System.out.println("Kérem, válasszon a fenti menüpontok közül!");

        Scanner scanner = new Scanner(System.in);
        int menuChoosen = scanner.nextInt();
        scanner.nextLine();

        if (menuChoosen == 1) {
            System.out.println("Felhasználók listázása");
        } else {
            System.out.println("Felhasználó felvétele");
        }
    }
}

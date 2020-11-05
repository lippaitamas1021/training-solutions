package statements;

import java.util.Scanner;

public class DivByThree {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem, adjon meg egy számot");
        int numberOne = scanner.nextInt();
        scanner.nextLine();

        System.out.println(numberOne % 3 == 0 ? "osztható 3-mal" : "nem osztható 3-mal");
    }
}

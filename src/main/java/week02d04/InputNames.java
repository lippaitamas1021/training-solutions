package week02d04;

import java.util.Arrays;
import java.util.Scanner;

public class InputNames {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[5];
        for (int i = 0; i < names.length; i++) {
            System.out.println("Kérem, adjon meg egy nevet:");
            names[i] = scanner.nextLine();
        }
        System.out.println(Arrays.toString(names));
    }
}

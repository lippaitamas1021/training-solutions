package numbers;

import java.util.Scanner;

public class CircleMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Első kör átmérője: ");
        int diameter1 = scanner.nextInt();
        scanner.nextLine();
        Circle circle1 = new Circle(diameter1);

        System.out.println("Második kör átmérője: ");
        int diameter2 = scanner.nextInt();
        scanner.nextLine();
        Circle circle2 = new Circle(diameter2);

        System.out.println("Első kör kerülete: " + circle1.perimeter());
        System.out.println("Első kör területe: " + circle1.area());
        System.out.println("Második kör kerülete: " + circle2.perimeter());
        System.out.println("Második kör területe: " + circle2.area());
    }
}

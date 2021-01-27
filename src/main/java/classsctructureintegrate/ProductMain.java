package classsctructureintegrate;

import java.util.Scanner;

public class ProductMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Termék neve: ");
        String name = scanner.nextLine();

        System.out.println("Termék ára: ");
        int price = scanner.nextInt();

        Product product = new Product(name, price);
        System.out.println(product.getName() + " " + product.getPrice());

        product.increasePrice(2000);
        System.out.println(product.getName() + " " + product.getPrice());

        product.decreasePrice(1000);
        System.out.println(product.getName() + " " + product.getPrice());
    }
}


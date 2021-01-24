package week03d04;

import java.util.Scanner;

public class PhoneParser {

    public Phone parse(String phoneNumber) {
        int prefix = Integer.parseInt(phoneNumber.substring(0,2));
        int number = Integer.parseInt(phoneNumber.substring(3,9));
        Phone phone = new Phone(phoneNumber.substring(0,2), phoneNumber.substring(3,9));
        return phone;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem, adja meg a körzetszámot:");
        int prefix = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Kérem, adja meg a telefonszámot:");
        int number = scanner.nextInt();
        scanner.nextLine();

        PhoneParser phoneParser = new PhoneParser();

        System.out.println(phoneParser.parse("10-1234567"));
        }
    }

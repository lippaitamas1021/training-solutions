package week03d04;

import java.util.Scanner;

public class PhoneParser {

    public Phone parse(String phoneNumber) {
        String prefix1 = phoneNumber.substring(0,2);
        String number1 = phoneNumber.substring(3,10);
        Phone phone = new Phone(prefix1, number1);
        return phone;
    }

    public static void main(String[] args) {
        PhoneParser phoneParser = new PhoneParser();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem, adja meg a telefonszámát a következő formátumban: 10-1234567");
        String phoneNumber = scanner.nextLine();
        System.out.println(phoneParser.parse(phoneNumber));
        }
    }

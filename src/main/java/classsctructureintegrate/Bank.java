package classsctructureintegrate;

import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mi az új bankszámla száma?");
        String accountNumber = scanner.nextLine();

        System.out.println("Ki a bankszámla tulajdonosa?");
        String owner = scanner.nextLine();

        System.out.println("Mekkora összeggel nyitja meg a számlát?");
        int balance = scanner.nextInt();
        scanner.nextLine();

        BankAccount account1 = new BankAccount(accountNumber, owner, balance);

        System.out.println("Mi az új bankszámla száma?");
        String accountNumber2 = scanner.nextLine();

        System.out.println("Ki az új bankszámla tulajdonos?");
        String owner2 = scanner.nextLine();

        System.out.println("Mekkora összeggel nyitja az új bankszámlát?");
        int amount2 = scanner.nextInt();
        scanner.nextLine();

        BankAccount account2 = new BankAccount(accountNumber2, owner2, amount2);

        System.out.println(account1.getInfo());
        System.out.println(account2.getInfo());

        System.out.println("Mennyit szeretne befizetni az első számlára?");
        int depositAmount = scanner.nextInt();
        account1.deposit(depositAmount);

        System.out.println(account1.getInfo());

        System.out.println("Mennyit szeretne felvenni a második számláról?");
        int withdrawAmount = scanner.nextInt();
        account2.withdraw(withdrawAmount);

        System.out.println(account2.getInfo());

        System.out.println("Mennyit szeretne átutalni az első számláról a másodikra?");
        int transferAmount = scanner.nextInt();
        account1.transfer(account2, transferAmount);

        System.out.println(account1.getInfo());
        System.out.println(account2.getInfo());
    }
}

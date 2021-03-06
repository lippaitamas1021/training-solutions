package ioreadstring.transaction;

public class BankAccount {

    private String name;
    private String accountNumber;
    private int balance;

    public BankAccount(String name, String accountNumber, int balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(double amount) {
        this.balance += amount;
    }





    //    private String name;
//    private String accountNumber;
//    private double balance;
//
//    public BankAccount(String name, String accountNumber, double balance) {
//        this.name = name;
//        this.accountNumber = accountNumber;
//        this.balance = balance;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getAccountNumber() {
//        return accountNumber;
//    }
//
//    public double getBalance() {
//        return balance;
//    }
//
//    public void setBalance(double amount) {
//        this.balance += amount;
//    }
}

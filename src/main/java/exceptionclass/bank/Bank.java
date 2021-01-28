package exceptionclass.bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<Account> accounts;
    private double initialBalance;
    private Bank bank;

    public Bank(List<Account> accounts) {
        if (accounts == null) {
            throw new IllegalArgumentException("Account can not be null");
        }
        this.accounts = new ArrayList<>(accounts);
    }

    public void payment(String accountNumber, double amount) {
        if (4 < accountNumber.length()) {
            throw new InvalidBankOperationException(ErrorCode.INVALID_ACCOUNTNUMBER);
        }
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                account.subtract(amount);
            }
        }
    }

    public void deposit(String accountNumber, double amount) {
        if (4 < accountNumber.length()) {
            throw new InvalidBankOperationException(ErrorCode.INVALID_ACCOUNTNUMBER);
        }
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                account.deposit(amount);
            }
        }
    }
}

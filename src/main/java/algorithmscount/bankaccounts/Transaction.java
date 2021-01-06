package algorithmscount.bankaccounts;

public class Transaction {

    private String accountNumber;
    private TransactionType transactionType;
    private int balance;

    public Transaction(String accountNumber, TransactionType transactionType, int balance) {
        this.accountNumber = accountNumber;
        this.transactionType = transactionType;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getAmount() {
        return balance;
    }

    public boolean isCredit() {
        if (transactionType == TransactionType.CREDIT) {
            return true;
        };
        return false;
    }

    public boolean isDebit() {
        if (transactionType == TransactionType.DEBIT) {
            return true;
        }
        return false;
    }
}

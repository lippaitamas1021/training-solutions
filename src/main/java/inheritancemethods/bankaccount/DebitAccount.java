package inheritancemethods.bankaccount;

public class DebitAccount {

    private static final double PERCENT = 3.0;
    private static final long MIN_COST = 200;

    private String accountNumber;
    private long balance;

    public DebitAccount(String accountNumber, long balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public final long costOfTransaction(long amount) {
        if ((amount * PERCENT) / 100.0 >= MIN_COST) {
            return amount * (long) PERCENT / 100;
        }
        return MIN_COST;
    }

    public boolean transaction(long amount) {
        long trx = amount + costOfTransaction(amount);
        if (trx <= balance) {
            balance -= trx;
            return true;
        }
        return false;
    }

    public void balanceToZero() {
        if (0 < balance) {
            balance = 0;
        }
    }
}

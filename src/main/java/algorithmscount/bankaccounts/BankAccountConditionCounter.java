package algorithmscount.bankaccounts;

import java.util.List;

public class BankAccountConditionCounter {

    private List<BankAccount> bankAccounts;

    public int countWithBalanceGreaterThan(List<BankAccount> bankAccounts, int amount) {
        int count = 0;
        for (BankAccount bankAccount : bankAccounts) {
            if (amount < bankAccount.getBalance()) {
                count++;
            }
        }
       return count;
    }
}

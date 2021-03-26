package algorithmscount.transaction;

import java.util.List;

public class TransactionCounter {

    public int countWithBalanceSmallerThan(List<Transaction> transactions, int level) {
        int counter = 0;
        for (Transaction transaction : transactions) {
            if (transaction.getAmount() < level) {
                counter++;
            }
        }
        return counter;
    }
}

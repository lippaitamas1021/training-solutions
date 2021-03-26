package algorithmscount.transaction;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TransactionCounterTest {

        @Test
        public void testCountWithBalanceSmallerThan() {
            List<Transaction> transactions = Arrays.asList(
                    new Transaction("1234", TransactionType.CREDIT, 100),
                    new Transaction("2345", TransactionType.DEBIT, 200),
                    new Transaction("3456", TransactionType.CREDIT, 300),
                    new Transaction("4567", TransactionType.DEBIT, 400));
            assertEquals(0, new TransactionCounter().countWithBalanceSmallerThan(transactions, 100));
            assertEquals(3, new TransactionCounter().countWithBalanceSmallerThan(transactions, 400));
        }

}
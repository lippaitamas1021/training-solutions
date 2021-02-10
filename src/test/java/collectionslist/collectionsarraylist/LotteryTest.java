package collectionslist.collectionsarraylist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.HashSet;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class LotteryTest {

    @Test
    public void wrongParametersShouldThrowExeption() throws IllegalArgumentException {
        int lotteryType = 6;
        int ballCount = 6;
        Exception ex = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Lottery().selectWinningNumbers(lotteryType, ballCount);
        });
        Assertions.assertEquals("Balls must be more, than the winning numbers!", ex.getMessage());
    }

    @Test
    public void winningNumbersCountShouldBeEqualToLotteryType() throws IllegalArgumentException {
        int lotteryType = 5;
        int ballCount = 90;
        List<Integer> winningNumbers = new Lottery().selectWinningNumbers(lotteryType, ballCount);
        Assertions.assertEquals(lotteryType, new HashSet<>(winningNumbers).size());
        for (int winningNumber : winningNumbers) {
            Assertions.assertTrue(winningNumber > 0);
            Assertions.assertTrue(winningNumber <= ballCount);
        }
    }
}

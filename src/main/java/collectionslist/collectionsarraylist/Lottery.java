package collectionslist.collectionsarraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lottery {

    private List<Integer> createBallPool(int balls){
        List<Integer> ballPool = new ArrayList<>();
        for (int i = 1; i <= balls; i++) {
            ballPool.add(i);
        }
        Collections.shuffle(ballPool);
        return ballPool;
    }


    public List<Integer> selectWinningNumbers(int lotteryType, int ballCount) throws IllegalArgumentException {
        if (ballCount <= lotteryType) {
            throw new IllegalArgumentException("Balls must be more, than the winning numbers!");
        }
        List<Integer> ballPool = createBallPool(ballCount);
        List<Integer> winningNumbers = ballPool.subList(0, lotteryType);
        Collections.sort(winningNumbers);
        return winningNumbers;
    }

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        lottery.createBallPool(90);
        System.out.println(lottery.selectWinningNumbers(5,90));
    }
}

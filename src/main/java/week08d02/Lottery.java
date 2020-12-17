package week08d02;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lottery {

    public static final int NUMBER_OF_NUMBERS = 5;
    public static final int NUMBERS_INTERVAL = 90;

    public List<Integer> getNumbers() {
        Random random = new Random();
        List<Integer> result = new ArrayList<>(5);

        for (int i = 0; i < NUMBER_OF_NUMBERS; i++) {
            result.add(generateNumberNotInList(result));
        }
        return result;
    }

    private Integer generateNumberNotInList(List<Integer> myList) {
        Random random = new Random(10);
        int number = random.nextInt(NUMBERS_INTERVAL) + 1;
        while (myList.contains(number)) {
            number = random.nextInt(NUMBERS_INTERVAL) +1;
        }
        return number;
    }

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        System.out.println(lottery.getNumbers());
    }

}

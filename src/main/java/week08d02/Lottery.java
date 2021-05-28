package week08d02;

import java.util.*;

public class Lottery {

    public static final int NUMBER_OF_NUMBERS = 7;
    public static final int NUMBERS_INTERVAL = 35;

    public List<Integer> getNumbers() {
        Random random = new Random();
        List<Integer> result = new ArrayList<>(7);
        for (int i = 0; i < NUMBER_OF_NUMBERS; i++) {
            result.add(generateNumberNotInList(result));
        }
        Collections.sort(result);
        return result;
    }

        private Integer generateNumberNotInList(List<Integer> myList) {
        Random random = new Random();
        int number = random.nextInt(NUMBERS_INTERVAL) + 1;
        while (myList.contains(number)) {
            number = random.nextInt(NUMBERS_INTERVAL) +1;
        }
        return number;
    }

    public List<Integer> getNumbersOneLoop(int interval, int numbers) {
        List<Integer> result = new ArrayList<>();
        Random random = new Random();

        while (result.size() < numbers) {
            int number = random.nextInt(interval) + 1;
            if (result.contains(number)) {
                result.add(number);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        System.out.println(lottery.getNumbers());
    }
}

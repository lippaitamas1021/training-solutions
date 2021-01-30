package week13d04;

import java.util.ArrayList;
import java.util.List;

public class Lists {

    public List<Integer> numbers(int numberOfNumbers) {
        List<Integer> numbers = new ArrayList<>(numberOfNumbers);
        for (int i = 2; i < 2 * numberOfNumbers + 1; i = i + 2) {
            numbers.add(i);
        }
        return numbers;
    }

    public static void main(String[] args) {
        System.out.println(new Lists().numbers(3));
    }
}

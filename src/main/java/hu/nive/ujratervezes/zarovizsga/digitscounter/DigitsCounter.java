package hu.nive.ujratervezes.zarovizsga.digitscounter;

import java.util.ArrayList;
import java.util.List;

public class DigitsCounter {

    public int getCountOfDigits(String s) {
        List<Integer> numbers = new ArrayList<>();
        if (s == null || ("").equals(s)) {
            return 0;
        }
        for (int i = 0; i < s.length(); i++) {
            int number = Integer.parseInt(String.valueOf(s.charAt(i)));
            if (0 <= number && number <= 9) {
                if (!(numbers.contains(number))) {
                    numbers.add(number);
                }
            }
        }
        return numbers.size();
    }
}


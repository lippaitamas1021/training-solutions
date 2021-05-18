package practice;

import java.util.ArrayList;
import java.util.List;

public class DigitsCounter {

    public int getCountOfDigits(String s) {
        int counter = 0;
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (!result.contains(s.charAt(i))) {
                result.add(Integer.parseInt(String.valueOf(s.charAt(i))));
            }
        }
        for (int i = 0; i < result.size(); i++) {
            if (result.contains(i)) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        DigitsCounter dc = new DigitsCounter();
        dc.getCountOfDigits("12344566");
        System.out.println(dc.getCountOfDigits("1234456666666"));
    }
}

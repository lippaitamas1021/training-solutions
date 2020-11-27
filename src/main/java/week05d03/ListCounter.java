package week05d03;

import java.util.List;

public class ListCounter {

    public int counter(List<String> list) {

        int sum = 0;

        for (String each : list) {
            String firstChar = each.substring(0, 1);
            if (firstChar.toLowerCase().equals("a"))
                sum++;
        }
        return sum;
    }
}




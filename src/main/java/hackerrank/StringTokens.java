package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringTokens {

    private String splitter(String line) {
        String delimiters = "[ .,'?!]+";
        String[] temp = line.split(delimiters);
        List<String> tokens = new ArrayList<>(Arrays.asList(temp));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(tokens.size()).append("\n");
        for (String t : tokens) {
            stringBuilder.append(t).append("\n");
        }
        return stringBuilder.toString().trim();
    }

    public static void main(String[] args) {
        StringTokens stringTokens = new StringTokens();
        String line = "He is a very very good boy, isn't he?";
        System.out.println(stringTokens.splitter(line));
    }
}

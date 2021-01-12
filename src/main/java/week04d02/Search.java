package week04d02;

import java.util.ArrayList;
import java.util.List;

public class Search {

    public List<Integer> getIndexesOfChar(String a, char b) {
        List<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < a.length(); i++) {
            if (b == a.charAt(i)) {
                indexes.add(i);
            }
        }
        return indexes;
    }

    public static void main(String[] args) {
        Search search = new Search();
        System.out.println(search.getIndexesOfChar("almafa", 'a'));
    }
}

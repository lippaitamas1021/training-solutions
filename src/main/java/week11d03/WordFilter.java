package week11d03;

import java.util.ArrayList;
import java.util.List;

public class WordFilter {

    public List<String> wordsWithChar(List<String> words, char c) {
        List<String> result = new ArrayList<>();
        String s = String.valueOf(c);
        for (String word : words) {
            if (word.contains(s)) {     //word.contains.valueOf(c) ?      word.indexOf(c) >= 0  ha az indexe nagyobb, mint 0, akkor szerepel aszóban a karakter
                result.add(word);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        WordFilter wordFilter = new WordFilter();
        List<String> list1 = new ArrayList<>();
        list1.add("alma");
        list1.add("ananász");
        list1.add("banán");
        list1.add("dió");
        list1.add("mogyoró");
        list1.add("narancs");

        System.out.println(list1);
        System.out.println(wordFilter.wordsWithChar(list1, 'c'));
    }
}

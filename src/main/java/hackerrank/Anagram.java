package hackerrank;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

    private static void isAnagram(String s, String t) {
        Map<String, Integer> letterFrequencyS = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (letterFrequencyS.containsKey(String.valueOf(c))) {
                letterFrequencyS.put(String.valueOf(c).toLowerCase(), letterFrequencyS.get(String.valueOf(c)) + 1);
            } else {
                letterFrequencyS.put(String.valueOf(c).toLowerCase(), 1);
            }
        }
        Map<String, Integer> letterFrequencyT = new HashMap<>();
        for (char c : t.toCharArray()) {
            if (letterFrequencyT.containsKey(String.valueOf(c))) {
                letterFrequencyT.put(String.valueOf(c).toLowerCase(), letterFrequencyT.get(String.valueOf(c)) + 1);
            } else {
                letterFrequencyT.put(String.valueOf(c).toLowerCase(), 1);
            }
        }
        if (letterFrequencyS.equals(letterFrequencyT)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }

    public static void main(String[] args) {
        isAnagram("anagram", "margana");
        isAnagram("anagramm", "marganaa");
        isAnagram("Hello", "hello");
    }
}

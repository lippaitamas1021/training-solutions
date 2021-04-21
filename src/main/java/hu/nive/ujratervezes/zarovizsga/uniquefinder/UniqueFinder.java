package hu.nive.ujratervezes.zarovizsga.uniquefinder;

import java.util.ArrayList;
import java.util.List;

public class UniqueFinder {

    private List<Character> characters = new ArrayList<>();

    public List<Character> uniqueChars(String word) {
        if (word == null) {
            throw new IllegalArgumentException("The word can not be empty");
        }
        for (char c : word.toCharArray()) {
            if (!characters.contains(c)) {
                characters.add(c);
            }
        }
        return characters;
    }
}

package week13d05;

import java.util.*;

public class Letter {

    private int min;
    private int max;

    public Letter(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int letterCounter(String word) {
        List<Character> numberOfCharacter = new ArrayList<>();
        String wordLowerCase = word.toLowerCase();
        for (int i = 0; i < wordLowerCase.length(); i++) {
            int number = wordLowerCase.charAt(i);           // implicit csat-olás, mert a charAt(i) karaktert ad viszza, de átalakítja számmá
            if (min <= number && number <= max) {
                if (!(numberOfCharacter.contains(wordLowerCase.charAt(i)))) {   // a set-tel nem kell ez az ellenőrzés
                    numberOfCharacter.add(wordLowerCase.charAt(i));
                }
            }
        }
        return numberOfCharacter.size();
    }

    public int counter(String inputWord) {
        if (inputWord.length() < 1) {
            throw new IllegalArgumentException("No character in the word");
        }
        if (Integer.MAX_VALUE < inputWord.length()) {
            throw new IllegalArgumentException("Too many character in the word");
        }
        String inputWord2 = inputWord.toLowerCase();
        Set<Character> characterSet = new HashSet<>();
        for (int i = 0; i < inputWord2.length(); i++) {
            char characterToBeChecked = inputWord2.charAt(i);
            if (Character.isLetter(characterToBeChecked)) characterSet.add(characterToBeChecked);
        }
        return (int) characterSet.size();
    }

    public int characterCounter(String word) {
        char[] arr = word.toLowerCase().toCharArray();
        Set<Character> characters = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {          // forEach ciklus jobb lenne
            if (isEnglishChar(arr[i])) {
                characters.add(arr[i]);
            }
        }
        return characters.size();
    }

    private boolean isEnglishChar(char c) {
        if ('a' <= c && c <= 'z') {         // return ('a' <= c && c <= 'z')    ez is elég
            return true;
        }
        return false;
    }

    public int uniqueLetterCounter(String word) {
        Set<Character> result = new HashSet<>();                    // a HashSet nem rendezve tárolja az elemeket
        for (Character c : word.toLowerCase().toCharArray()) {      // Character helyett lehetne char is, ekkor gyorsabb lenne
            if (checkLetter(c)) {
                result.add(c);
            }
        }
        return result.size();
    }

    private boolean checkLetter(char c) {
        return 'a' <= c && c <= 'z';
    }

    public int countDifferentLetters(String word) {
        Set<Character> differentLetters = new TreeSet<>();      // a TreeSet rendezve tárolja az elemeket, ábécé sorrendben
        char[] lettersOfWord = word.toLowerCase().toCharArray();
        for (char c : lettersOfWord) {
            if ('a' <= c && c <= 'z') {
                differentLetters.add(c);
            }
        }
        return differentLetters.size();
    }

    public int letterCounter2(String word) {
        if (word == null) {
            throw new IllegalArgumentException("Null parameter error");
        }
        Map<Character, Integer> counter = new HashMap<>();
        word = word.toLowerCase().replaceAll("[\\W\\d\\s]","");
        char[] stringArray = word.toCharArray();    // W = nonword; d = digit; s = whitespace
        for (char c : stringArray) {
            counter.put(c, 1);
        }
        return counter.size();
    }

    public static void main(String[] args) {
        Letter letter = new Letter(97, 122);
        System.out.println(letter.letterCounter("interface"));
        System.out.println(letter.counter("konkatenáció"));
        System.out.println(letter.characterCounter("implementáció"));
        System.out.println(letter.uniqueLetterCounter("komplementer"));
        System.out.println(letter.countDifferentLetters("inicializátor"));
        System.out.println(letter.letterCounter2("multiplikatív"));
        System.out.println("a123l456l789".replaceAll("[^'a-z]", ""));        // regex101.com
    }
}

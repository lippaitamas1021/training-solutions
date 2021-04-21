package hu.nive.ujratervezes.zarovizsga.words;

public class Words {

    public boolean hasMoreDigits(String word) {
        int digitCounter = 0;
        int wordCounter = 0;
        for (char c : word.toCharArray()) {
            if (Character.isDigit(c)) {
                digitCounter++;
            } else {
                wordCounter++;
            }
        }
        return wordCounter < digitCounter;
    }
}

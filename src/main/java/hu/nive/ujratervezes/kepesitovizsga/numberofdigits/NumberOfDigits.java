package hu.nive.ujratervezes.kepesitovizsga.numberofdigits;

public class NumberOfDigits {

    public int getNumberOfDigits(int number) {
        int counter = 0;
        int numberOfDigits = 0;
        if (number < 10) {
            numberOfDigits = 1;
            counter += numberOfDigits * number;
        } else if (number < 100) {
            numberOfDigits = 2;
            counter += 9 + numberOfDigits * (number - 9);
        }
        return counter;
    }
}

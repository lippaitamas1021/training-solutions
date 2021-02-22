package exam03retake01;

public class CdvCheck {

    public boolean check(String taxNumber) {
        if (taxNumber.length() != 10) {
            throw new IllegalArgumentException("Wrong taxnumber");
        }
        String tenthNumber = taxNumber.substring(9);
        String nineNumber = taxNumber.substring(0,9);
        char[] charArray = nineNumber.toCharArray();
        int counter = 0;

        for (int i = 0; i < charArray.length; i++) {
            int number = Integer.parseInt(String.valueOf(charArray[i]));
            if (0 <= number && number <= 9) {
                counter += number * (i + 1);
            } else {
                throw new IllegalArgumentException("The taxnumber must contains only numbers");
            }
        }
        if (counter % 11 == Integer.parseInt(tenthNumber)) {
            return true;
        }
        return false;
    }
}

package exam02;

public class ArraySelector {

    public boolean isEmpty(int[] numbers) {
        return numbers.length == 0;
    }

    public String selectEvens(int[] numbers) {
        StringBuilder sb = new StringBuilder();
        if (isEmpty(numbers)) {
            return "";
        }
        int [] evenNumbers = new int[numbers.length];
        int db = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                evenNumbers[db] = numbers[i];
                sb.append(numbers[i]);
            }
            }
        String[] s = sb.toString().split("");
        return "[" + sb.toString() + "]";
            }
        }






package exam02;

public class ArraySelector {

    public String selectEvens(int[] numbers) {

        StringBuilder sb = new StringBuilder();

        if (0 < numbers.length) {
            sb.append("[");
        } else {
            return ""; }

            for (int i = 0; i < numbers.length; i++) {
                if (i % 2 == 0) {
                    sb.append(numbers[i]).append(", ");
                }
            }
        sb.delete(sb.length() - 2, sb.length());
        return sb.append("]").toString();
    }
}






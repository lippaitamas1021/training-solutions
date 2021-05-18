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

/*
public String selectEvens(int[] ints) {
    if (ints.length == 0) {
        return ""
        }
        int[] result = new int[(int) Math.round(ints.length / 2.0)];
        for (int i = 0; i < ints.length; i = i + 2) {
            result[i / 2] = ints[i];
            }

            return Arrays.toString(result);
            }
        }
 */




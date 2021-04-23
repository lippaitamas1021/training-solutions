package collapse;

public class Collapsing {

    public int[] collapse(int[] numbers) {
            int[] result;
            if (numbers.length % 2 == 0) {
                result = new int[numbers.length / 2];
            } else {
                result = new int[numbers.length / 2 + 1];
                result[numbers.length / 2] = numbers[numbers.length - 1];
            }
            for (int i = 0; i < numbers.length / 2; i++) {
                result[i] = numbers[2 * i] + numbers[2 * i + 1];
            }
            return result;
        }
    }
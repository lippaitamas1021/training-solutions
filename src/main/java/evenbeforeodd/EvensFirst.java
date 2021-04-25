package evenbeforeodd;

public class EvensFirst {

    public int[] evenBeforeOdd(int[] numbers) {
            int[] result = new int[numbers.length];
            int index = 0;
            int index2 = 0;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 == 0) {
                    result[index] = numbers[i];
                    index++;
                } else {
                    result[numbers.length - 1 - index2] = numbers[i];
                    index2++;
                }
            }
            return result;
        }
    }

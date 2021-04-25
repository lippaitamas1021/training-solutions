package vowelcount;

public class Vowels {

    public static int[] vowelCount(String text) {
        int[] results = new int[5];
        char[] arr = text.toLowerCase().toCharArray();
        results[0] = Vowels.counter(arr, 'a');
        results[1] = Vowels.counter(arr, 'e');
        results[2] = Vowels.counter(arr, 'i');
        results[3] = Vowels.counter(arr, 'o');
        results[4] = Vowels.counter(arr, 'u');
        return results;
    }

    private static int counter(char[] arr, char c) {
        int counter = 0;
        for (char item : arr) {
            if(item == c){
                counter++;
            }
        }
        return counter;
    }
}

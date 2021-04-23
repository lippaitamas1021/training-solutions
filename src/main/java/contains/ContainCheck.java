package contains;

public class ContainCheck {

    public static boolean contains(int[] numbers1, int[] numbers2) {
        for(int i = 0; i <= numbers1.length - numbers2.length; i++) {
            boolean b = true;
            for(int j = 0; j < numbers2.length; j++) {
                if(numbers1[i + j] != numbers2[j]) {
                    b = false;
                    break;
                }
            }
            if(b)
                return true;
        }
        return false;
    }
}
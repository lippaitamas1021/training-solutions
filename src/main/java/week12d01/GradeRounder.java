package week12d01;

import java.util.Arrays;

public class GradeRounder {

    public int [] roundGrades(int[] grades) {
        for (int i = 0; i < grades.length; i++) {
            if ( 40 < grades[i]) {
                int number = grades[i] / 5;
                int next = (number + 1) * 5;
                if (next - grades[i] < 3) {
                    grades[i] = next;
                }
            }
        }
        return grades;
    }

    public static void main(String[] args) {
        int[] result = new GradeRounder().roundGrades(new int[]{34, 81, 84});
        System.out.println(Arrays.toString(result));
    }
}

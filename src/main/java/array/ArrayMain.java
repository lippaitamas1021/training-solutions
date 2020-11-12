package array;

public class ArrayMain {

    public static void main(String[] args) {

        String[] weekDays = {"Hétfő", "Kedd", "Szerda", "Csütörtök", "Péntek", "Szombat", "Vasárnap"};

        System.out.println(weekDays[1]);
        System.out.println(weekDays.length);


        int[] exponentTwo = new int[5];
        exponentTwo[0] = 1;
        for (int i = 1; i < exponentTwo.length; i++) {
            exponentTwo[i] = exponentTwo[i - 1] * 2;
        }

        for (int i = 0; i < exponentTwo.length; i++) {
            System.out.println(exponentTwo[i] + " ");
        }

        System.out.println();



        boolean[] b = new boolean[6];

        for (int i = 1; i < b.length; i++) {
            b[i] = !b[i - 1];
        }

        for (int i = 1; i < b.length; i++) {
            System.out.println(b[i] + " ");
        }
    }
}

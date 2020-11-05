package localvariables;

public class LocalVariablesMain {

    public static void main(String[] args) {

        boolean b;
        b = false;

        int a = 2;
        int i = 3, j = 4;
        int k = i;
        String s = "Hello World!";
        String t = s;

        {
            int x = 0;

            System.out.println(a);
        }
    }
}

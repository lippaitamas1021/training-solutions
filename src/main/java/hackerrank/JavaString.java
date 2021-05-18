package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class JavaString {

    private String decider(String A, String B) {
        int index1 = A.charAt(0);
        int index2 = B.charAt(0);
        if (index2 < index1) {
            return "Yes";
        } else {
            return "No";
        }
    }

    private String concater(String A, String B) {

        StringBuilder sb1 = new StringBuilder();
        List<Character> letters1 = new ArrayList<>();
        for (char c : A.toCharArray()) {
            letters1.add(c);
        }
        sb1.append(letters1.get(0).toString().toUpperCase());
        for (int i = 1; i < letters1.size(); i++) {
            sb1.append(letters1.get(i));
        }

        StringBuilder sb2 = new StringBuilder();
        List<Character> letters2 = new ArrayList<>();
        for (char c : B.toCharArray()) {
            letters2.add(c);
        }
        sb2.append(letters2.get(0).toString().toUpperCase());
        for (int i = 1; i < letters2.size(); i++) {
            sb2.append(letters2.get(i));
        }

        return sb1 + " " + sb2;
    }

    public static void main(String[] args) {
        String A= "hello";
        String B= "java";
        System.out.println(A.length() + B.length());
        JavaString js = new JavaString();
        System.out.println(js.decider(A, B));
        System.out.println(js.concater(A, B));
    }
}


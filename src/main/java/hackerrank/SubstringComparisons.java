package hackerrank;

import java.util.*;

public class SubstringComparisons {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem, adja meg a szöveget:");
        String s = scanner.next();
        System.out.println("Kérem, adja meg a betűk számát:");
        int l = scanner.nextInt();
        SortedSet<String> sets=new TreeSet<String>();
        for(int i=0;i<=s.length()-l;i++){
            sets.add(s.substring(i,i+l));
        }
        System.out.println(sets.first());
        System.out.println(sets.last());
    }

//    private static void wordCreator(String s, int l) {
//        List<String> letters = new ArrayList<>();
//        for (char c : s.toCharArray()) {
//            letters.add(String.valueOf(c));
//        }
//        List<String> result = new ArrayList<>();
//        for (int i = 0; i < letters.size() - (l - 1); i = i+(l-2)) {
//            result.add(letters.get(i)+letters.get(i+1)+letters.get(i+2));
//        }
//        Collections.sort(result);
//        System.out.println(result.get(0));
//        System.out.println(result.get(result.size()-1));
//    }
}

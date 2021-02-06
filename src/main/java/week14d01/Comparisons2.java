package week14d01;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Comparisons2 {

    public static void main(String[] args) {
        Set<User2> orderedUser2 = new TreeSet<>(new Comparator<User2>() {
            @Override
            public int compare(User2 u1, User2 u2) {
                return u1.getName().compareTo(u2.getName());
            }
        });

    }
}

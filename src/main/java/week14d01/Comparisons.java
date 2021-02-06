package week14d01;

import java.util.Set;
import java.util.TreeSet;

public class Comparisons {

    public static void main(String[] args) {
        Set<User> orderedUsers = new TreeSet<>();
        orderedUsers.add(new User("Trey"));
        orderedUsers.add(new User("Mila"));
        orderedUsers.add(new User("Jenny"));

        System.out.println(orderedUsers);
    }
}

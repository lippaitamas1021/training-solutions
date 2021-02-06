package week14d01;

public class User implements Comparable<User> {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(User o) {
        return name.compareTo(o.name);
    }
}

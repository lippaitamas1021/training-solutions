package week14d01;

public class User2 {

    private String name;

    public User2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User2{" +
                "name='" + name + '\'' +
                '}';
    }
}

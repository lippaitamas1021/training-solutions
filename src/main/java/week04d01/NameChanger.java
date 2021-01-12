package week04d01;

public class NameChanger {

    private String firstName;
    private String lastName;
    private String fullName;

    public NameChanger(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + " " + lastName;
    }

    public String getFullName() {
        return lastName + " " + firstName;
    }

    public String changeFirstName(String firstName) {
        this.firstName = firstName;
        return getFullName();
    }

    public static void main(String[] args) {
        NameChanger nc = new NameChanger("Tamás", "Lippai");
        System.out.println(nc.changeFirstName("Zebulon"));
    }
}

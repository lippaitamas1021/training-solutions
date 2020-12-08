package introexception.patient;

public class Patient {

    public static final int MIN_YEAR = 1900;
    private String name;
    private String socialSecurityNumber;
    private int yearOfBirth;

    public Patient(String name, String socialSecurityNumber, int yearOfBirth) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name must not be empty");
        }
        if (yearOfBirth <= MIN_YEAR) {
            throw new IllegalArgumentException("Invalid year of birth: " + yearOfBirth);
        }
        if (!new SsnValidator().isValidSsn(socialSecurityNumber))
            throw new IllegalArgumentException("Invalid Social Security Number: " + socialSecurityNumber);
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
}

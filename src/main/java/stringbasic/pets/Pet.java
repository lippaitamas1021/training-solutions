package stringbasic.pets;

import java.time.LocalDate;
import java.util.Objects;

public class Pet {

    private String name;
    private LocalDate dateOfBirth;
    private Gender gender;
    private String registrationNumber;

    public Pet(String name, LocalDate dateOfBirth, Gender gender, String registrationNumber) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        if (registrationNumber.length() != 6) {
            throw new IllegalArgumentException("Wrong registration number");
        } else {
            this.registrationNumber = registrationNumber;
        }
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public Gender getGender() {
        return gender;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return registrationNumber.equals(pet.registrationNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(registrationNumber);
    }

    public static void main(String[] args) {
        Pet pet = new Pet("Cézár", LocalDate.of(2012,5,21), Gender.MALE, "000147");

    }
}

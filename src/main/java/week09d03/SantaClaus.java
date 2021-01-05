package week09d03;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SantaClaus {

    private List<Person> persons;

    public SantaClaus(List<Person> persons) {
        this.persons = persons;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void getThroughChimneys() {
        for (Person person : persons) {
            person.setPresent();;
        }
    }
}

package week09d03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    public void testOverFourTeen() {
        Person person = new Person("Trey Parker", 15);
        person.setPresent();

        assertNotEquals(null, person.getPresent());
        assertNotEquals(Present.TOY, person.getPresent());
    }

    @Test
    public void testUnderFourTeen() {
        Person person = new Person("Mila Kunis", 13);
        person.setPresent();

        assertNotEquals(null, person.getPresent());
    }
}
package week04d01;

import org.junit.jupiter.api.Test;

import javax.naming.Name;

import static org.junit.jupiter.api.Assertions.*;

class NameChangerTest {

    @Test
    void getFullNameTest() {
        assertEquals("Lippai Tamás", new NameChanger("Tamás", "Lippai").getFullName());
    }

       @Test
    void changeFirstNameTest() {
        assertEquals("Lippai Zebulon", new NameChanger("Tamás", "Lippai").changeFirstName("Zebulon"));
    }
}
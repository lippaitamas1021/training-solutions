package week05d05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UserTest {

    @Test
    public void getFullNameTest() {
        assertThrows(IllegalArgumentException.class, () -> {
            new User("Tamás", "Lippai", "lt.gmail.com");
        });
    }

    @Test
    public void testUserNoAt() throws IllegalArgumentException {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                new User("Tamás", "Lippai", "lt.gmail.com"));
        assertEquals("Hibás e-mail cím! \'@\' vagy \'.\' hiányzik!", exception.getMessage());
    }
}

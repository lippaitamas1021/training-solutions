package week02d02;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PhoneTest {

    @Test
    void getTypeTest() {
        Phone phone1 = new Phone("iPhone", 128);
        assertEquals("iPhone", phone1.getType());
    }

    @Test
    void getMemTest() {
        Phone phone2 = new Phone("iPhone", 128);
        assertEquals(128, phone2.getMem());
    }
}
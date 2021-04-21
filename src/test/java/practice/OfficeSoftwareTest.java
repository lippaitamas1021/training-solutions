package practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OfficeSoftwareTest {

    @Test
    void increasePrice() {
        OfficeSoftware officeSoftware = new OfficeSoftware("JAVA", 100);
        officeSoftware.increasePrice();
        assertEquals(105, officeSoftware.getPrice());
    }
}
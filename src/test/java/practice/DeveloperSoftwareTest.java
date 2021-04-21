package practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DeveloperSoftwareTest {

    @Test
    void increasePrice() {
        DeveloperSoftware developerSoftware = new DeveloperSoftware("JAVA EE", 1000);
        developerSoftware.increasePrice();
        assertEquals(1100, developerSoftware.getPrice());
    }
}
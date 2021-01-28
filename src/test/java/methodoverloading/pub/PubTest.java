package methodoverloading.pub;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PubTest {

    @Test
    public void constructorTest() {
        Pub pub = new Pub("Kurta kocsma", 10, 30);
        assertEquals("Kurta kocsma", pub.getName());
        assertEquals(10, pub.getOpeningTime().getHours());
        assertEquals(30, pub.getOpeningTime().getMinutes());
    }

    @Test
    public void toStringTest() {
        Pub pub = new Pub("Kurta kocsma", 10, 30);
        assertEquals("Kurta kocsma;10:30", pub.toString());
    }
}

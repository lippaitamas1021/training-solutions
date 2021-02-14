package datenewtypes;

import org.junit.jupiter.api.Test;
import java.time.LocalTime;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RendezvousTest {

    @Test
    public void emptyPatternShouldThrowException() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Rendezvous("10:20", ""));
        assertEquals("Empty pattern string!", ex.getMessage());
    }

    @Test
    public void emptyTimeStringShouldThrowException() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Rendezvous("", "hh:mm"));
        assertEquals("Illegal time string: ", ex.getMessage());
    }

    @Test
    public void illegalTimeStringShouldThrowException() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Rendezvous("10:20:20", "hh:mm"));
        assertEquals("Illegal time string: 10:20:20", ex.getMessage());
    }

    @Test
    public void testToString() {
        Rendezvous rendezvous = new Rendezvous(21, 30);
        assertEquals("21-30", rendezvous.toString("HH-mm"));
    }

    @Test
    public void emptyPatternInToStringMethodShouldThrowException() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Rendezvous("10:20", "HH:mm").toString("\t"));
        assertEquals("Empty pattern string!", ex.getMessage());
    }

    @Test
    public void testCountMinutesLeft() {
        LocalTime base = LocalTime.of(20, 30);
        Rendezvous rendezvous = new Rendezvous(22, 0);
        assertEquals(90, rendezvous.countMinutesLeft(base));
    }

    @Test
    public void tooLateToGoShouldThrowException() {
        LocalTime now = LocalTime.of(15, 0);
        Exception ex = assertThrows(MissedOpportunityException.class, () -> new Rendezvous(10, 30).countMinutesLeft(now));
        assertEquals("Too late!", ex.getMessage());
    }

    @Test
    public void testPushLater() {
        Rendezvous rendezvous = new Rendezvous(22, 0);
        rendezvous.pushLater(0, 90);
        assertEquals("23:30", rendezvous.toString("HH:mm"));
    }

    @Test
    public void testPullEarlier() {
        Rendezvous rendezvous = new Rendezvous(22, 0);
        rendezvous.pullEarlier(1, 15);
        assertEquals("20:45", rendezvous.toString("HH:mm"));
    }
}

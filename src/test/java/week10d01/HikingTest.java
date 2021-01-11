package week10d01;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class HikingTest {

    @Test
    void getPlusElevation() {
        Hiking hiking = new Hiking();
        double result;
        result = hiking.getPlusElevation(List.of(10d,20d, 15d, 18d));
        assertEquals(13, result);

        assertEquals(13.0, new Hiking().getPlusElevation(List.of(10.0, 20.0, 15.0, 18.0)));

        assertEquals(0.0, new Hiking().getPlusElevation(List.of(10.0)));

        assertEquals(0.0, new Hiking().getPlusElevation(List.of()));

        assertThrows(IllegalArgumentException.class, () -> new Hiking().getPlusElevation(null));

    }
}
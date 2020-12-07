package controlselection.greetings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetingsTest {
    @Test
    public void testGreet() {
        Greetings greetings = new Greetings();
        assertEquals("jó éjt", greetings.greeter(4, 30));
        assertEquals("jó éjt", greetings.greeter(5, 0));
        assertEquals("jó reggelt", greetings.greeter(5, 1));
        assertEquals("jó reggelt", greetings.greeter(9, 0));
        assertEquals("jó napot", greetings.greeter(9, 1));
        assertEquals("jó napot", greetings.greeter(18, 30));
        assertEquals("jó estét", greetings.greeter(18, 31));
        assertEquals("jó estét", greetings.greeter(20, 0));
        assertEquals("jó éjt", greetings.greeter(20, 1));
    }
}

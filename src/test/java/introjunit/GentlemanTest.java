package introjunit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GentlemanTest {

    @Test
    public void sayHelloTest() {
        String name = "Tamás";
        String greeting = new Gentleman().sayHello(name);

        assertEquals("Hello, Tamás!", greeting);
    }
}
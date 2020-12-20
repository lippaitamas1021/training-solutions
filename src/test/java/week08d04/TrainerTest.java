package week08d04;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrainerTest {

    @Test
    public void trainerTest() {
        GoodMood trainer = new GoodMood();
        BadMood trainer2 = new BadMood();

        assertEquals(5, trainer.giveMark());
        assertEquals(3, trainer2.giveMark());
    }
}

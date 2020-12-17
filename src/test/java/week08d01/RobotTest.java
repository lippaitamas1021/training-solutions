package week08d01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RobotTest {

    @Test
    public void RobotMoveTest() {
        Robot robot = new Robot();
        robot.move("FFFLLLJJJBBB");
        assertEquals(0, robot.getPosition().getX());
        assertEquals(0, robot.getPosition().getY());
    }

    @Test
    public void WrongRobotMoveTest() {
        Robot robot = new Robot();
        assertThrows(IllegalArgumentException.class, ()-> robot.move("FFFLDLJJJBBB"));
    }
}

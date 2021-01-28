package ioreadstring.names;

import org.junit.jupiter.api.Test;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FileManagerTest {

    private FileManager fm = new FileManager("names.txt");

    @Test
    public void createClassTest() {
        assertEquals("names.txt", fm.getPath().getFileName().toString());
        assertEquals(0, fm.getHumans().size());
    }

    @Test
    public void readFromFileTest() throws IOException {
        fm.readFromFile();
        assertEquals(5, fm.getHumans().size());
        assertEquals("Jane", fm.getHumans().get(1).getFirstName());
    }
}

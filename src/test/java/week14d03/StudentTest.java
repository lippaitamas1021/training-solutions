package week14d03;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    public void createStudentTest() {
        Student student = new Student("Abraham");
        assertEquals("Abraham", student.getName());
    }

    @Test
    void addNotesTest() {
        Student student = new Student("Liza");

        student.addNote("math", 5);
        assertEquals(1, student.getNotes().size());

        student.addNote("math", 4);
        assertEquals(1, student.getNotes().size());

        student.addNote("biology", 4);
        assertEquals(2, student.getNotes().size());

        assertEquals(5, student.getNotes().get("math").get(0));
        assertEquals(4, student.getNotes().get("math").get(1));
        assertEquals(4, student.getNotes().get("biology").get(0));
    }
}
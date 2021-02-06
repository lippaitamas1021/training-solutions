package week14d03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClassNotebookTest {

    @Test
    void getStudentsTest() {
        ClassNotebook classNotebook = new ClassNotebook(new ArrayList<>(List.of(new Student("Trey"), new Student("Mila"), new Student("Stan"))));
        classNotebook.getStudents().add(new Student("Karl"));           //nem engedi hozzáadni
        System.out.println(classNotebook.getStudents().size());
    }

    @Test
    void sortNotebookTest() {
        ClassNotebook classNotebook = new ClassNotebook(new ArrayList<>(List.of(new Student("Trey"), new Student("Mila"), new Student("Stan"))));
        List<Student> result = classNotebook.sortNotebook();
        System.out.println(result);
        //assertEquals("Mila", classNotebook.getStudents().get(0).getName());
        assertEquals("Stan", result.get(1).getName());
        assertEquals("Trey", result.get(2).getName());
    }
}
package week14d03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClassNotebook {

    private List<Student> students;

    public ClassNotebook(List<Student> students) {          //konstruktor helyett példányosítás is lehetne az attribútum sorában, csak valahol kapjon értéket
        this.students = students;
    }

    public List<Student> getStudents() {
        return new ArrayList<>(students);               // referencián keresztül nem fér hozzá az objektumon, mert csak másolata az eredetinek és nem lehet getter-en keresztül mainpulálni, nem lehet getterrel hozzáadni új elemet
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> sortNotebook() {
        List<Student> result = new ArrayList<>(students);       //copy konstruktor, másolat létrehozása, új ArrayList, aminek egy Collections-t is megadhatok paraméterül
        Collections.sort(result);
        return result;
    }

    public static void main(String[] args) {
        ClassNotebook classNotebook = new ClassNotebook(new ArrayList<>(List.of(new Student("Trey"), new Student("Mila"), new Student("Karl"))));
//        System.out.println(classNotebook.sortNotebook());
//        System.out.println(classNotebook.getStudents());
//        classNotebook.addStudent(classNotebook.getStudents().get(0));
        classNotebook.getStudents().get(0).addNote("history", 5);
        System.out.println(classNotebook.getStudents().get(0));
        classNotebook.getStudents().get(1).addNote("biology", 3);
        System.out.println(classNotebook.getStudents().get(1));
        classNotebook.getStudents().get(2).addNote("literature", 4);
        System.out.println(classNotebook.getStudents().get(2));



    }
}

/*package schoolrecords.records;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private List<Mark> marks = new ArrayList<>();
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double calculateAverage() {

    }

    public double calculateSubjectAverage() {

    }

    public void grading(Mark mark) {
        marks.add(0, mark);
    }

    public boolean isEmpty(String name) {
        return true;
    }

    @Override
    public String toString() {
        return "Student{" +
                "marks=" + marks +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Student student = new Student("Kovács");
        student.grading(new Mark(MarkType.A, "matematika", "Nagy Csilla"));
    }
}


 */
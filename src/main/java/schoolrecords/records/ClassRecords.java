/*package schoolrecords.records;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassRecords {

    private String className;
    private Random md;
    private List<Student> students = new ArrayList<>();


    public ClassRecords(String className, Random md) {
        this.className = className;
        this.md = md;
    }

    public boolean addStudent(Student student) {
        if (!students.contains(student)) {
            return students.add(student);
        } else {
            return false;
        }
    }

    public double calculateClassAverage() {
        return calculateClassAverage();
    }


    public boolean removeStudent(Student student){
            if (!students.contains(student)) {
                return false;
            } else {
                students.remove(student);
            }
        return true;
        }



    public double calculateClassAverageBySubject() {
        return calculateClassAverage();
    }




    public String findStudentByName(String name) {
        if (students.contains(name)) {
            return name;
        }
        return "Student not found";
    }

    public Student repetition() {
        Random random = new Random();
        int szam;
        for (int i = 0; i < 100; i++) {
            szam = random.nextInt();
            students.indexOf(szam);
        }
    }

    public List<StudyResultByName> listStudyResults() {

    }

    public String listStudentNames() {

    }

    public static void main(String[] args) {

        ClassRecords classRecords = new ClassRecords("Fourth Grade A", );
        Student firstStudent = new Student("Kovács Rita");
        classRecords.addStudent(firstStudent);
        Student secondStudent = new Student("Nagy Béla");
        classRecords.addStudent(secondStudent)
        Student thirdStudent = new Student("Varga Márton");
        classRecords.addStudent(thirdStudent);
        firstStudent.grading(new Mark(MarkType.A, new Subject("földrajz"), tutor));
        firstStudent.grading(new Mark(MarkType.C, new Subject("matematika"), tutor));
        firstStudent.grading(new Mark(MarkType.D, new Subject("földrajz"), tutor));
        secondStudent.grading(new Mark(MarkType.A, new Subject("biológia"), tutor));
        secondStudent.grading(new Mark(MarkType.C, new Subject("matematika"), tutor));
        secondStudent.grading(new Mark(MarkType.D, new Subject("zene"), tutor));
        thirdStudent.grading(new Mark(MarkType.A, new Subject("fizika"), tutor));
        thirdStudent.grading(new Mark(MarkType.C, new Subject("kémia"), tutor));
        thirdStudent.grading(new Mark(MarkType.D, new Subject("földrajz"), tutor));
    }
}

 */

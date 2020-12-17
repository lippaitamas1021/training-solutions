/*package schoolrecords.records;

import java.util.Arrays;
import java.util.List;

public class Tutor {

    private String name;
    private List<Subject> taughtSubjects;

    public Tutor(String name, List<Subject> taughtSubjects) {
        this.name = name;
        this.taughtSubjects = taughtSubjects;
    }

    public String getName() {
        return name;
    }

    public boolean tutorTeachingSubject(Subject subject) {
        if (taughtSubjects.contains(subject)) {
            return true;
        }
        return false;
    }

    private boolean isEmpty(String str) {
        if (str.length() < 1) {
            return true;
        }
        return false;
    }




    public static void main(String[] args) {
        Tutor tutor = new Tutor("Nagy Csilla", Arrays.asList(new Subject("matematika"), new Subject("fizika")));
        System.out.println(tutor.getName() + tutor.tutorTeachingSubject());
    }
}


 */
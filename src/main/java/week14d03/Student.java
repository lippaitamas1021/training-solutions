package week14d03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student implements Comparable<Student> {

    private String name;
    private Map<String, List<Integer>> notes = new HashMap<>();

    public Student(String name) {
        this.name = name;
    }

//    public Student(Student another) {               // copy constructor
//        this.name = another.name;
//        this.notes = new HashMap<>(another.notes);
//    }

    public Map<String, List<Integer>> getNotes() {
        return notes;
    }

    public void addNote(String subject, int note) {
        if (!notes.containsKey(subject)) {
            notes.put(subject, new ArrayList<>());
        }
        notes.get(subject).add(note);
        }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", notes=" + notes +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return name.compareTo(o.name);
    }
}



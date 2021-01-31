package ioreader.grades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {

    private String name;
    private List<Integer> gradeList;

    public Student(String name, List<Integer> gradeList) {
        this.name = name;
        this.gradeList = gradeList;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getGradeList() {
        return new ArrayList<>(gradeList);
    }

    public double average() {
        double sum = 0;
        int numberOfGrades = 0;
        for (int i = 0; i < gradeList.size(); i++) {
            sum += gradeList.get(i);
            numberOfGrades++;
        }
        return sum / numberOfGrades;
    }

    public boolean isIncreasing() {
        for (int i = 0; i < gradeList.size(); i++) {
            if (gradeList.get(gradeList.size() - 2) < gradeList.get(gradeList.size() - 1)) {
                return true;
            } else {
                return false;
            }
        }
        throw new IllegalArgumentException("Wrong list");
    }

    public static void main(String[] args) {
        Student student = new Student("Jack_Doe", Arrays.asList(2, 3, 4, 5));
        System.out.println(student.getGradeList().size());
    }
}

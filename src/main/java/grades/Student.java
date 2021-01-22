package grades;

import com.sun.source.tree.BreakTree;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private List<Integer> gradeList;

    public Student(String name, List<Integer> gradeList) {
        this.name = name;
        this.gradeList = new ArrayList<>(gradeList);
    }

    public String getName() {
        return name;
    }

    public List<Integer> getGradeList() {
        return gradeList;
    }

    public double average() {
        int sum = 0;
        for (int i = 0; i < gradeList.size(); i++) {
            sum += getGradeList().get(i);
        }
        return (double) sum / gradeList.size();
    }

    public boolean isIncreasing() {
        for (int i = 1; i < gradeList.size(); i++) {
            if (gradeList.get(gradeList.size() - 1) > gradeList.size()) {
                return true;
            }
        }
        return false;
    }
}

package exam02.cv;

import java.util.ArrayList;
import java.util.List;

public class Cv {

    private String name;
    private List<String> skills = new ArrayList<>();

    public Cv(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void addSkills(String skill) {
        skills.add(skill);
    }


    public static void main(String[] args) {
        Cv cv1 = new Cv("John Doe");
        System.out.println(cv1.getSkills().size());
        cv1.addSkills("programming (5)");
        cv1.addSkills("oo design (2)");
        System.out.println(cv1.getSkills().size());
        System.out.println(cv1.getSkills().get(0));

    }
}

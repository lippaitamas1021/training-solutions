package exam02.cv;

import java.util.ArrayList;
import java.util.List;

public class Cv {

    private String name;
    private List<Skill> skills = new ArrayList<>();

    public Cv(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void addSkills(String... skills) {
        for (String s : skills) {
            String name = s.substring(0, s.indexOf("(")).trim();
            int level = Integer.parseInt(s.substring(s.indexOf("(") + 1, s.indexOf(")")));
            this.skills.add(new Skill(name, level));
        }
    }

    public int findSkillLevelByName(String name) {
        for (Skill s : skills) {
            if (s.getName().equals(name)) {
                return s.getLevel();
            }
        }
        throw new IllegalArgumentException("Wrong skill name!");
    }
}

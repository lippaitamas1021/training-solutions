package week13d03;

public class Subject {

    private String name;
    private String subjectName;
    private String className;
    private int numberOfLessons;

    public Subject(String name, String subjectName, String className, int numberOfLessons) {
        this.name = name;
        this.subjectName = subjectName;
        this.className = className;
        this.numberOfLessons = numberOfLessons;
    }

    public String getName() {
        return name;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public String getClassName() {
        return className;
    }

    public int getNumberOfLessons() {
        return numberOfLessons;
    }
}

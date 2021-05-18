package hu.nive.ujratervezes.zarovizsga.workhours;

public class Work {

    private String name;
    private int number;
    private String date;

    public Work(String name, int number, String date) {
        this.name = name;
        this.number = number;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public String getDate() {
        return date;
    }
}

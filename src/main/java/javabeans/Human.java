package javabeans;

public class Human {

    private String name;
    private double weight;
    private int iq;

    public Human(String name, double weight, int iq) {
        this.name = name;
        this.weight = weight;
        this.iq = iq;
    }

    public Human() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }
}

package javabeans;

public class Dog {

    private String name;
    private int age;
    private boolean pedigree;
    private double weight;

    public Dog(String name, int age, boolean pedigree, double weight) {
        this.name = name;
        this.age = age;
        this.pedigree = pedigree;
        this.weight = weight;
    }

    public Dog() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isPedigree() {
        return pedigree;
    }

    public void setPedigree(boolean pedigree) {
        this.pedigree = pedigree;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

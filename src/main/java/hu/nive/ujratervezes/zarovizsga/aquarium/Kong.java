package hu.nive.ujratervezes.zarovizsga.aquarium;

public class Kong extends Fish {

    public Kong(String name, int weight, String color) {
        super(name, weight, color);
    }

    @Override
    public String status() {
        return super.toString();
    }

    @Override
    public void feed() {
        super.increaseWeight(2);
    }

    @Override
    public boolean hasMemoryLoss() {
        return false;
    }
}

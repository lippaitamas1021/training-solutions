package practice;

public abstract class Software {

    private final String name;
    private double price;

    protected Software(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public abstract void increasePrice();

    protected void setPrice(double diff) {
        this.price *= 1 + (diff / 100);
    }
}

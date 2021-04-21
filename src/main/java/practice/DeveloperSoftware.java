package practice;

public class DeveloperSoftware extends Software {

    public DeveloperSoftware(String name, double price) {
        super(name, price);
    }

    @Override
    public void increasePrice() {
        setPrice(10);
    }
}

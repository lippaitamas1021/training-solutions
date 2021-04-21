package practice;

public class OfficeSoftware extends Software {

    public OfficeSoftware(String name, double price) {
        super(name, price);
    }

    @Override
    public void increasePrice() {
        setPrice(5);
    }
}

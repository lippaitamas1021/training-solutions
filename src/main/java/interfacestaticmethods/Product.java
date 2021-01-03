package interfacestaticmethods;

import java.util.List;

public class Product implements Valued{

    private String name;
    private double value;

    public Product(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    @Override
    public double getValue() {
        return value;
    }


}

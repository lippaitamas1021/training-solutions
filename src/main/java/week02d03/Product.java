package week02d03;

public class Product {

    private final String name;
    private final String code;

    public Product(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public boolean areTheyEqual(Product product) {
        return product.getName() == this.name && product.getCode().length() == this.code.length();
    }

    public static void main(String[] args) {
        Product product1 = new Product("milk", "123456");
        Product product2 = new Product("bread", "123456");
        System.out.println(product1.areTheyEqual(product2));

    }
}

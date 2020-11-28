package week05d04;

import java.util.ArrayList;
import java.util.List;

public class Store {

    public List<Product> products = new ArrayList<>();

    public boolean containsByName(Product product) {
        for (Product p : products) {
            if (p.getName().equals(product.getName())) {
                return true;
            }
        }
        return false;
    }

    public boolean isValid(Product product) {
        if (containsByName(product) || product.isExpired()) {
            return false;
        }
        return true;
    }

    public boolean addProduct(Product product) {
        if (!isValid(product)) {
            return false;
        }
        products.add(product);
        return true;
    }

    public int getNumberOfExpired() {
        int count = 0;
        for (Product p : products) {
            if (p.isExpired()) {
                count++;
            }
        }
        return count;
    }

}

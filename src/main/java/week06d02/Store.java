package week06d02;

import java.util.ArrayList;
import java.util.List;

public class Store {

    private List<Product> products;

    public Store(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return new ArrayList<>(products);
    }

    public int getProductByCategoryName(String category) {
        int count = 0;
        for (Product p: products) {
            if (p.getCategory() == category) {
                count++;
            }
        }
        return count;
    }

}

package week06d02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SToreTest {

    @Test
    public void getProductByCategoryNameTest() {
        Store store = new Store(Arrays.asList(
                new Product("Bread", "BAKEDGOODS", 300),
                new Product("Milk", "DAIRY", 250),
                new Product("Yogurt", "DAIRY", 200),
                new Product("Chicken", "FROZEN", 1000),
                new Product("Telephone", "OTHER", 100000)
        ));

        Assertions.assertEquals(1, store.getProductByCategoryName("BAKEDGOODS"));
        Assertions.assertEquals(1, store.getProductByCategoryName("FROZEN"));
    }
}

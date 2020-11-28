package week05d04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StoreTest {

    @Test
    public void addProductTest() {
        Store store = new Store();

        assertFalse(store.addProduct(new Product("yoghurt", 2020, 11, 27 )));

        assertTrue(store.addProduct(new Product("milk", 2020, 12, 5)));

        assertTrue(store.addProduct(new Product("bread", 2020, 11, 30)));
    }

    @Test
    public void getNumberOfExpired() {

    }
}

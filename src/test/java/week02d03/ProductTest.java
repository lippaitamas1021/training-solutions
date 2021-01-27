package week02d03;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void areTheyEqualTest() {
        Product product1 = new Product("milk", "123456");
        Product product2 = new Product("bread", "123456");
        assertEquals(false, product1.areTheyEqual(product2));
    }
}
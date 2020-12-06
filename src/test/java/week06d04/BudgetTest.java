package week06d04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class BudgetTest {

    private Budget budget = new Budget(Arrays.asList(
            new Item(999, 2020, 9, 10, "Pear"),
            new Item(1999, 2020, 9, 5, "Apricot"),
            new Item(499, 2020, 8, 19, "Watermelon"),
            new Item(199, 2020, 10, 20, "Apple")
    ));

    @Test
    public void getItemsByMonthTest() {
        List<Item> result = budget.getItemsByMonth(9);

        Assertions.assertEquals(2, result.size());
        Assertions.assertEquals("Apricot", result.get(1).getName());

    }
}

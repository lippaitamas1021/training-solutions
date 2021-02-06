package week14d02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Orders {

    private Map<String, TreeSet<String>> ordersMap = new HashMap<>();

    public void readFromFile(String source) {
        InputStreamReader is = new InputStreamReader(week14d02.Orders.class.getResourceAsStream(source));
        try (BufferedReader br = new BufferedReader(is)) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] split = line.split(" ");
                TreeSet<String> products = new TreeSet<>();
                Collections.addAll(products, split[1].split(","));
                ordersMap.put(split[0], products);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read the file", ioe);
        }
    }
    public TreeSet<String> getProductsOrdersById(String id) {
        return ordersMap.get(id);
    }

    public Map<String, Integer> getProductsMap() {
        Map<String, Integer> productsMap = new HashMap<>();
        for (TreeSet<String> set : ordersMap.values()) {
            for (String item : set) {
                if (!productsMap.containsKey(item)) {
                    productsMap.put(item, 1);
                } else {
                    productsMap.put(item, productsMap.get(item) + 1);
                }
            }
        }
        return productsMap;
    }

    public int getNumbersOfOrderedProducts(String prodeuct) {
        return getProductsMap().get(prodeuct);
    }

    public int getNumberByOrderedId(String id) {
        return getProductsOrdersById(id).size();
    }

    public static void main(String[] args) {
        Orders orders = new Orders();
        orders.readFromFile("orders.txt");
        System.out.println(orders.ordersMap);
        System.out.println(orders.getProductsOrdersById("CM231"));
        System.out.println(orders.getNumbersOfOrderedProducts("sugar"));
        System.out.println(orders.getNumberByOrderedId("B3402"));
        System.out.println(orders.getProductsMap());
    }
}

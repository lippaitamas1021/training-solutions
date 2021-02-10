package ioconvert.shopping;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ShoppingListManager {

    public void saveShoppingList(OutputStream os, List<String> shoppingList) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(os))) {
            for (String s : shoppingList) {
                    bufferedWriter.write(s);
                    bufferedWriter.newLine();
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot write file", ioe);
    }
}


    public List<String> loadShoppingList(InputStream is) {
        List<String> shoppingList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                shoppingList.add(line);
            }
            return shoppingList;
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write the file", ioe);
        }
    }
}

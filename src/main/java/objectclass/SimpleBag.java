package objectclass;

import java.util.ArrayList;
import java.util.List;

public class SimpleBag {

    private List<Object> items = new ArrayList<>();
    private int cursor = -1;

    public SimpleBag() {
        beforeFirst();
    }

    public List<Object> getItems() {
        return items;
    }

    public int getCursor() {
        return cursor;
    }

    public void putItem(Object item) {
        if (!items.contains(item)) {
            items.add(item);
        }
    }

    public boolean isEmpty() {
        return items.size() == 0;
    }

    public int size() {
        return items.size();
    }

    public void beforeFirst() {
        cursor = -1;
    }

    public boolean hasNext() {
        return !(isEmpty() || items.size() - 1 <= cursor);
    }

    public Object next() {
        cursor++;
        return items.get(cursor);
    }

    public boolean contains(Object item) {
        return items.contains(item);
    }
}
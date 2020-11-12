package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Books {

    private final List<String> titles = new ArrayList<>();

    public void add(String title) {
        titles.add(title);
    }

    public void removeByPrefix(String prefix) {
        List<String> toDelete = new ArrayList<>();
        for (String title : titles) {
            if (title.startsWith(prefix)) {
                toDelete.add(title);
            }
        }
        titles.removeAll(toDelete);
    }

    public List<String> findAllByPrefix(String prefix) {
        List<String> found = new ArrayList<>();
        for (String title : titles) {
            if (title.startsWith(prefix)) {
                found.add(title);
            }
        }
        return found;
    }

    public List<String> getTitles() {
        return titles;
    }

    public static void main(String[] args) {
        Books books = new Books();
        books.add("Az ember tragédiája");
        books.add("Kincskereső kisködmön");
        books.add("Pál utcai fiúk");
        books.add("Toldi");

        System.out.println(books.getTitles());

        System.out.println(books.findAllByPrefix("Kincs"));

        books.removeByPrefix("Pál");
        System.out.println(books.getTitles());
    }
}

package attributes.book;

public class BookMain {

    public static void main(String[] args) {

        Book book1 = new Book("Az ember tragédiája");

        System.out.println(book1.getTitle());

        book1.setTitle("Toldi");
        System.out.println(book1.getTitle());
    }
}

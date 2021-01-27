package classsctructureconstructors;

public class BookMain {

    public static void main(String[] args) {

        Book book = new Book("Reiter István", "C# Programozás Lépésről-lépésre");
        book.register("321");

        System.out.println("Szerző: " + book.getAuthor());
        System.out.println("Cím: " + book.getTitle());
        System.out.println("Regisztrációs szám: " + book.getRegNumber());
        }
}

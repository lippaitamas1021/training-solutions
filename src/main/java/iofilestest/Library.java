package iofilestest;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {

    private List<Book> books = new ArrayList<>();

    public void add(Book book) {
        books.add(book);
    }

    public void saveBooks(Path path) {
        try (PrintWriter printWriter = new PrintWriter(Files.newBufferedWriter(path))) {
            for (Book book : books) {
                printWriter.write(book.getAuthor() + ", " + book.getTitle());
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write file", ioe);
        }
    }

    public void loadBooks(Path path) {
        try (Scanner scanner = new Scanner(Path.of("books.csv"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
//                System.out.println(line);
                String[] temp = line.split(";");
                String author = temp[1];
                String title = temp[2];
                books.add(new Book(author, title));
            }
//            System.out.println(books);
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file", ioe);
        }
    }

    public static void main(String[] args) {
        new Library().loadBooks(Path.of("books.csv"));

        Path path = Path.of("books.txt");
        new Library().saveBooks(path);

    }
}

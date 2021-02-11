package collectionsiterator.collectionsiterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LibraryManager {

    private Set<Book> libraryBooks = new HashSet<>();

    public LibraryManager(Set<Book> libraryBooks) {
        this.libraryBooks = libraryBooks;
    }

    public Book findBookByRegNumber(int regNumber) {
        Book found;
        Iterator<Book> iter = libraryBooks.iterator();
        while (iter.hasNext()) {
            found = iter.next();
            if (found.getRegNumber() == regNumber) {
                return found;
            }
        }
        throw new MissingBookException("No books found with regnumber: " + regNumber);
    }

    public int removeBookByRegNumber(int regNumber) {
        Book found;
        Iterator<Book> iter = libraryBooks.iterator();
        while (iter.hasNext()) {
            if (iter.next().getRegNumber() == regNumber) {
                iter.remove();
                return regNumber;
            }
        }
        throw new MissingBookException("No books found with regnumber: " + regNumber);
    }

    public Set<Book> selectBooksByAuthor(String author) {
        Set<Book> authorBookList = new HashSet<>();
        Book found;
        Iterator<Book> iter = libraryBooks.iterator();
        while (iter.hasNext()) {
            found = iter.next();
            if (found.getAuthor().equals(author)) {
                authorBookList.add(found);
            }
        }
        if (authorBookList.isEmpty()) {
            throw new MissingBookException("No books found by " + author);
        }
        return authorBookList;
    }

    public int libraryBooksCount() {
        return libraryBooks.size();
    }
}

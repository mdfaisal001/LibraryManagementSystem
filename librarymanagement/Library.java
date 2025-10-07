package librarymanagement;

import java.util.*;

abstract public class Library {
    protected List<Book> books;

    Library() {
        books = new ArrayList<Book>();
    }

    abstract public void addBook(Book book);

    abstract public void removeBook(String isbn);

    abstract public Book searchBook(String title);

    abstract public void displayBooks();

}

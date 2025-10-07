package librarymanagement;

import java.util.*;

public class Admin extends User {

    Admin(String name, String userId, Library library) {
        super(name, userId, library);
    }

    public void addBook(Book book) {
        library.addBook(book);
        System.out.println("Admin " + name + " (" + userId + ") added a book successfully.");
    }

    public void removeBook(String isbn) {
        library.removeBook(isbn);
        System.out.println("Admin " + name + " (" + userId + ") removed a book successfully.");
    }

    public void searchBook(String title) {
        library.searchBook(title);
    }

    public Book checkAvailability(String title) {
        Book b = library.searchBook(title);
        if (b != null) {
            if (b.getAvailability()) {
                System.out.println("Book is available");
                return b;

            } else {
                System.out.println("Book is not available");
            }
        } else {
            System.out.println("Book not found");
        }
        return null;
    }

}

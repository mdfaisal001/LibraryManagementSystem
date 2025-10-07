package librarymanagement;

import java.util.*;

public class Member extends User {
    Member(String name, String userId, Library library) {
        super(name, userId, library);
    }

    public void borrowBook(String title) {
        Book b = library.searchBook(title);
        if (b != null && b.getAvailability()) {
            borrowedBooks.add(b);
            System.out.println(name + "(" + userId + ") borrowwed " + title + "successfully");
            b.setAvailability(false);
        } else {
            System.out.println("Book not found");
        }
    }

    public void returnBook(String title) {
        Book b = library.searchBook(title);
        borrowedBooks.remove(b);
        b.setAvailability(true);
        System.out.println("Book successfully returned by" + name + "(" + userId + ")");
    }
}

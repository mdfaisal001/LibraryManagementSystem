package librarymanagement;

import java.util.*;

public class User {
    protected String name;
    protected String userId;
    protected Library library;
    protected List<Book> borrowedBooks;

    User(String name, String userId, Library library) {
        this.name = name;
        this.userId = userId;
        borrowedBooks = new ArrayList<Book>();
        this.library = library;
    }

    public String getDetails() {
        return name + "(" + userId + ")";
    }

}

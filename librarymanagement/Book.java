package librarymanagement;

import java.util.*;

public class Book {
    protected String title, author, isbn;
    protected Boolean isAvailable;

    Book(String title, String author, String isbn, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = true;
    }

    // //getter and setter for the title
    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    // //getter and setter for the author
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    // //getter and setter for the isbn
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    // getter and setter for the isAvailale
    public void setAvailability(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public boolean getAvailability() {
        return isAvailable;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    }
}

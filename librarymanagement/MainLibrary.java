package librarymanagement;

public class MainLibrary extends Library {

    @Override
    public void addBook(Book book) {
        books.add(book);
        System.out.println(book.getTitle() + " added successfully");
    }

    @Override
    public void removeBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                books.remove(book);
                System.out.println(book.getTitle() + "removed successfully");
                return;
            }
        }
        System.out.println("Book with ISBN " + isbn + " not found.");
    }

    @Override
    public Book searchBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    @Override
    public void displayBooks() {
        for (Book book : books) {
            System.out.println("Book Name: " + book.getTitle() + ", Availability Status: " + book.getAvailability());
        }
    }

}

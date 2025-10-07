package librarymanagement;

public class Main {

    public static void main(String[] args) {
        Book book1 = new Book("1984", "George Orwell", "1234567890", true);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "0987654321", true);
        Library library = new MainLibrary();

        User admin = new Admin("Faisal", "A001", library);
        if (admin instanceof Admin) {
            ((Admin) admin).addBook(book1);
            ((Admin) admin).addBook(book2);
            ((Admin) admin).checkAvailability("1984");
        }

        User member = new Member("Abara", "M001", library);
        if (member instanceof Member) {
            {
                ((Member) member).borrowBook("1984");
                ((Member) member).returnBook("1984");
            }

        }
    }
}

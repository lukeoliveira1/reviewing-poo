package Books;

public class Main {
    public static void main(String[] args) {
        Library<Publication> library = new Library<>();

        Book book = new Book("The Lord of the Rings", "J.R.R. Tolkien", 1954);
        Book book2 = new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling", 1997);

        Magazine magazine = new Magazine("National Geographic", "", 2023);
        Magazine magazine2 = new Magazine("Time", "", 2024);

        library.addPublication(book);
        library.addPublication(book2);
        library.addPublication(magazine);
        library.addPublication(magazine2);

        library.listPublications();
    }
}


package Misscellaneous.LibraryManagementSystem;
import java.util.ArrayList;
import java.util.Comparator;

public class Library {

    public static void main(String[] args) {

        Library library = new Library();
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", Genre.FICTION, 1960);
        Book book2 = new Book("Life of a Traveller", "George Orwell", Genre.FANTASY, 1949);
        Book book3 = new Book("Animal Farm", "George Orwell", Genre.SCIENCE, 1945);
        Book book4 = new Book("The Great Gatsby", "F. Scott Fitzgerald", Genre.FICTION, 1925);
        Book book5 = new Book("The Catcher in the Rye", "J.D. Salinger", Genre.MYSTERY, 1951);
        Book book6 = new Book("Pride and Prejudice", "Jane Austen", Genre.HISTORY, 1813);
        Book book7 = new Book("The Help", "J.D. Salinger", Genre.NON_FICTION, 1953);


        //adding 3 books to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        //removing book 3 from the library
        library.removeBook(book3);

        //displaying all books
        System.out.println("These are the list of books in the library: ");
        library.displayAllBooks();
        System.out.println("\n--------------------------------");

        System.out.println("\nDisplay books by their genre: ");
        library.displayBooksByGenre(Genre.FICTION);

        //sorting books by published Year
        System.out.println("\n--------------------------------");
        library.sortBooksByYear();

        //searching for a book by title
        System.out.println("\n--------------------------------\n");
        System.out.println("Searching for a book by title: ");
        library.searchBook("The Great Gatsby");


    }

    ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }

    public void removeBook(Book book){
        books.remove(book);
    }
    // display all books method
    public void displayAllBooks(){
        for(Book book: books){
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }
    }
    //display books by genre method
    public void displayBooksByGenre(Genre genre){
        for(Book book: books){
            if(book.getGenre() == genre){
                System.out.println(book.getTitle() + " by " + book.getAuthor());
            }
        }
    }
    //sort by year method
    public void sortBooksByYear(){
        books.sort(Comparator.comparingInt(Book::getPublicationYear));
        System.out.println("\nBooks sorted by publication year: ");
        for(Book book: books){
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }
    }
    //search for books method
    public void searchBook(String title){
        for(Book book: books){
            if(book.getTitle().equalsIgnoreCase(title)){
                System.out.println(book.getTitle() + " by " + book.getAuthor());
                return;
            }
        }
        System.out.println("Book not found");
    }


}

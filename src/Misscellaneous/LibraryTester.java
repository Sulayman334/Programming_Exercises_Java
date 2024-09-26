package Misscellaneous;

public class LibraryTester {
    public static void main(String[] args) {

        Library library = new Library();

        Book book1 = new Book("Java 1","Omar Gisseh",2024);
        Book book2 = new Book("C++","James Joyce",2010);
        Book book3 = new Book("C#","Sulayman Colley",2023);
        Book book4 = new Book("Javascript","Alasan Saine",2007);
        Book book5 = new Book("Java5","Javascript",2045);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);

        library.displayBooks();
        library.findBooks("Sulayman Colley");


    }
}

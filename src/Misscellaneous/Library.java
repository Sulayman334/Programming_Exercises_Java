package Misscellaneous;

public class Library {

    private Book[] books = new Book[5];
    private int bookCount;

    public Library() {
        Book [] books = new Book[5];
        bookCount = 0;
    }

    public void addBook(Book book) {
        if (bookCount < books.length){
            books[bookCount] = book;
            bookCount++;
            System.out.println("The book "+book.getTitle()+" has successfully been added");
        }else {
            System.out.println("Cannot add more books, The library id full");
        }
    }


    public void displayBooks(){
        if (bookCount == 0){
            System.out.println("The library is empty");
        } else {
            for (int i = 0; i < books.length; i++){
                System.out.println(books[i]);
            }
        }
    }

    public void findBooks(String author){
        for(int i = 0;i < books.length; i++){
            boolean found = false;
            if (books[i]!= null && books[i].getAuthor().equals(author)){
                System.out.println(books[i]);
                found = true;
            }
            if (!found){
                System.out.println("No books by "+author+" found");
            }
        }


    }
}

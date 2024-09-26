package Misscellaneous.LibraryManagementSystem;

public class Book {
    private String title;
    private String author;
    private  Genre genre;
    private int publicationYear;

    public Book(String title, String author, Genre genre, int publicationYear){
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.publicationYear = publicationYear;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public Genre getGenre(){
        return genre;
    }

    public int getPublicationYear(){
        return publicationYear;
    }

    public void displayInfo(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Genre: " + genre);
        System.out.println("Publication Year: " + publicationYear);
    }
}

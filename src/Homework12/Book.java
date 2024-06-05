package Homework12;

public class Book {
    private int id = 1;
    private String bookTitle;
    private String description;
    private String nameAuthor;

    public Book(int i, String bookTitle, String description, String author) {
    }
    public Book(String bookTitle, String description, String nameAuthor) {
        this.id++;
        this.bookTitle = bookTitle;
        this.description = description;
        this.nameAuthor = nameAuthor;
    }
    public String getbookTitle() {
        return this.bookTitle;
    }
    public String getNameAuthor() {
        return nameAuthor;
    }
    public int getId() {
        return id;
    }
    public String getDescription() {
        return description;
    }
}
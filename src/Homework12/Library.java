package Homework12;

import java.util.*;

public class Library {
    private final Map<String, List<Book>> library = new HashMap<>();
    private int bookIdCounter = 1;
    public void addBook(String bookTitle, String author, String description) {
        List<Book> books = library.getOrDefault(author, new ArrayList<>());
        books.add(new Book(bookIdCounter++, bookTitle, description, author));
        library.put(author, books);
    }
    public void takeBook(String author, String title) {
        List<Book> books = library.get(author);
        if (books != null) {
            books.removeIf(book -> book.getbookTitle().equals(title));
        }
    }
    public void getBookInfo(String author, String title) {
        List<Book> books = library.get(author);
        if (books != null) {
            for (Book book : books) {
                if (book.getbookTitle().equals(title)) {
                    System.out.println(book);
                    return;
                }
            }
        }
        System.out.println("Книга не найдена.");
    }
    public void getBooksByAuthor(String author) {
        List<Book> books = library.get(author);
        if (books != null) {
            for (Book book : books) {
                System.out.println(book.getbookTitle());
            }
        } else {
            System.out.println("Не найдено книг по автору: " + author);
        }
    }
    public void getAllAuthors() {
        Set<String> authors = library.keySet();
        for (String author : authors) {
            System.out.println(author);
        }
    }
}
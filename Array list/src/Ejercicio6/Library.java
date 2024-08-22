package Ejercicio6;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(String ISBN) {
        books.removeIf(book -> book.getISBN().equalsIgnoreCase(ISBN));
    }

    public Book searchBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
                return book;
            }
        }
        return null;
    }

    public ArrayList<Book> searchBooksByAuthor(String author) {
        ArrayList<Book> foundBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().toLowerCase().contains(author.toLowerCase())) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }

    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("There are no books in the library.");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
}

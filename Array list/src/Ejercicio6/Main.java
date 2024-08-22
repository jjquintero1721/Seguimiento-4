package Ejercicio6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("\n*** Library Menu ***");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Search Book by Title");
            System.out.println("4. Search Book by Author");
            System.out.println("5. List All Books");
            System.out.println("6. Exit");
            System.out.print("Select an option: ");
            option = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            switch (option) {
                case 1:
                    System.out.print("Enter the book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter the book author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter the book ISBN: ");
                    String ISBN = scanner.nextLine();
                    System.out.print("Enter the book publication year: ");
                    int publicationYear = scanner.nextInt();
                    Book newBook = new Book(title, author, ISBN, publicationYear);
                    library.addBook(newBook);
                    System.out.println("Book added successfully.");
                    break;

                case 2:
                    System.out.print("Enter the ISBN of the book to remove: ");
                    String isbnToRemove = scanner.nextLine();
                    library.removeBook(isbnToRemove);
                    System.out.println("Book removed if it existed in the library.");
                    break;

                case 3:
                    System.out.print("Enter the title of the book to search: ");
                    String titleToSearch = scanner.nextLine();
                    Book foundBook = library.searchBookByTitle(titleToSearch);
                    if (foundBook != null) {
                        System.out.println("Book found: " + foundBook);
                    } else {
                        System.out.println("No book found with that title.");
                    }
                    break;

                case 4:
                    System.out.print("Enter the author of the book to search: ");
                    String authorToSearch = scanner.nextLine();
                    ArrayList<Book> booksByAuthor = library.searchBooksByAuthor(authorToSearch);
                    if (!booksByAuthor.isEmpty()) {
                        System.out.println("Books found:");
                        for (Book book : booksByAuthor) {
                            System.out.println(book);
                        }
                    } else {
                        System.out.println("No books found by that author.");
                    }
                    break;

                case 5:
                    System.out.println("List of books in the library:");
                    library.listBooks();
                    break;

                case 6:
                    System.out.println("Exiting the system...");
                    break;

                default:
                    System.out.println("Invalid option, please try again.");
                    break;
            }
        } while (option != 6);

        scanner.close();
    }
}


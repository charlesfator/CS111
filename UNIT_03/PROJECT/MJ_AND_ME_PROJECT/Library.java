/**
 * Represents a Library that manages a collection of books
 * Author: MJ
 * Collaborator: 
 * Last Modified: <12/09/24/>
 */

import java.util.ArrayList;

public class Library {

    // List to store all books in the library
    private ArrayList<Book> books;

    // Default constructor to initialize an empty library
    public Library() {
        books = new ArrayList<>();
    }

    // Method to add a new book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Method to display all books in the library
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    // Method to search for a book by title
    public void searchBook(String title) {
        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Book Found: " + book);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book not found.");
        }
    }
}
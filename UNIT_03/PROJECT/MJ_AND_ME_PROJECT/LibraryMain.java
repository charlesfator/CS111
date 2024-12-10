/**
 * Driver class for the Library Management System
 * Authors: MJ abdirahman,Charlie Fator
 * Collaborator: 
 * Last Modified:<12/09/24/>
 */

import java.util.Scanner;

public class LibraryMain {

    public static void main(String[] args) {
        // Create a Library object to manage books
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        // Introduction to the program
        System.out.println("Welcome to the Library Management System!");
        int choice;

        // Menu-driven loop to perform actions
        do {
            // Display menu options
            System.out.println("\nMenu:");
            System.out.println("1. Add a Book");
            System.out.println("2. Display All Books");
            System.out.println("3. Search for a Book by Title");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            // Perform actions based on user input
            switch (choice) {
                case 1:
                    // Adding a new book
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter book year: ");
                    int year = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    library.addBook(new Book(title, author, year));
                    System.out.println("Book added successfully!");
                    break;

                case 2:
                    // Display all books
                    System.out.println("Books in the Library:");
                    library.displayBooks();
                    break;

                case 3:
                    // Search for a book by title
                    System.out.print("Enter the title of the book to search: ");
                    String searchTitle = scanner.nextLine();
                    library.searchBook(searchTitle);
                    break;

                case 4:
                    // Exit the program
                    System.out.println("Exiting Library Management System. Goodbye!");
                    break;

                default:
                    // Handle invalid input
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 4);

        scanner.close(); // Close the scanner
    }
}
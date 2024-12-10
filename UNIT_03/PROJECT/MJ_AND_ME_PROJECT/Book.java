/**
 * Represents a Book in the library system
 * Author: MJ
 * Collaborator: 
 * Last Modified: <12/09/24/>
 */

public class Book {

    // Instance variables to store book information
    private String title;    // Title of the book
    private String author;   // Author of the book
    private int year;        // Year the book was published

    // Default constructor to create an empty Book object
    public Book() {
        this.title = "";
        this.author = "";
        this.year = 0;
    }

    // Full constructor to create a Book object with specified details
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // Getter methods to retrieve instance variable values
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    // Setter methods to update instance variable values
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Method to update all fields at once
    public void setAll(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // Method to provide a string representation of a Book object
    @Override
    public String toString() {
        return "Book Title: " + title + ", Author: " + author + ", Year: " + year;
    }

    // Method to compare two books for equality based on their fields
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Book) {
            Book other = (Book) obj;
            return this.title.equals(other.title) &&
                   this.author.equals(other.author) &&
                   this.year == other.year;
        }
        return false;
    }
}
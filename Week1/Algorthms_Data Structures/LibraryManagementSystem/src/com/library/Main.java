package com.library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library(10);

        Book book1 = new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("B002", "1984", "George Orwell");
        Book book3 = new Book("B003", "To Kill a Mockingbird", "Harper Lee");

        // Add books to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Linear search for a book by title
        String searchTitle = "1984";
        Book foundBook = library.linearSearchByTitle(searchTitle);
        if (foundBook != null) {
            System.out.println("Linear Search: Book found - " + foundBook.getTitle() + " by " + foundBook.getAuthor());
        } else {
            System.out.println("Linear Search: Book not found.");
        }

        // Sort books by title for binary search
        library.sortBooksByTitle();

        // Binary search for a book by title
        foundBook = library.binarySearchByTitle(searchTitle);
        if (foundBook != null) {
            System.out.println("Binary Search: Book found - " + foundBook.getTitle() + " by " + foundBook.getAuthor());
        } else {
            System.out.println("Binary Search: Book not found.");
        }
    }
}


package com.library;

public class Library {
    private Book[] books;
    private int size;

    public Library(int capacity) {
        this.books = new Book[capacity];
        this.size = 0;
    }

    // Add a book
    public void addBook(Book book) {
        if (size < books.length) {
            books[size++] = book;
        }
    }

    // Linear search to find a book by title
    public Book linearSearchByTitle(String title) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return books[i];
            }
        }
        return null;
    }

    // Binary search to find a book by title (assuming the list is sorted)
    public Book binarySearchByTitle(String title) {
        int left = 0;
        int right = size - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int compareResult = title.compareToIgnoreCase(books[mid].getTitle());
            if (compareResult == 0) {
                return books[mid];
            } else if (compareResult < 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return null;
    }

    // Sort books by title (necessary for binary search)
    public void sortBooksByTitle() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (books[j].getTitle().compareToIgnoreCase(books[j + 1].getTitle()) > 0) {
                    Book temp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp;
                }
            }
        }
    }
}

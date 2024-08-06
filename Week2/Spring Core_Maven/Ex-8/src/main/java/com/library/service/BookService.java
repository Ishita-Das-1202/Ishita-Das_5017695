package com.library.service;

import com.library.model.Book;
import com.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class BookService {

    private BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Autowired
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void someBusinessMethod() {
        Collection<Book> allBooks = bookRepository.findAll();
        for (Book book : allBooks) {
            System.out.println("Book: " + book);
        }
    }

    public void addBook(Book book) {
        bookRepository.save(book);
    }

    public Book getBookById(Long id) {
        return bookRepository.findById(id);
    }

    public void removeBook(Long id) {
        bookRepository.delete(id);
    }

    public void printBookRepository() {
        System.out.println("BookRepository class: " + bookRepository.getClass().getName());
    }
}




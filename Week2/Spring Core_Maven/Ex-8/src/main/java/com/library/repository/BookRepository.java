package com.library.repository;
import com.library.model.Book;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Collection;

@Repository
public class BookRepository {

    private Map<Long, Book> bookStore = new HashMap<>();
    private static long idCounter = 1;

    public void save(Book book) {
        book.setId(idCounter++);
        bookStore.put(book.getId(), book);
        System.out.println("Book saved: " + book);
    }

    public Book findById(Long id) {
        return bookStore.get(id);
    }

    public void delete(Long id) {
        Book removedBook = bookStore.remove(id);
        System.out.println("Book removed: " + removedBook);
    }

    public Collection<Book> findAll() {
        return bookStore.values();
    }
}
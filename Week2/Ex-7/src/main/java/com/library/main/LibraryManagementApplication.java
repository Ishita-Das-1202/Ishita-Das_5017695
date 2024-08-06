package com.library.main;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagementApplication {
    public static void main(String[] args) {
        // Load the Spring context
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve the BookService bean
        BookService bookService = (BookService) context.getBean("bookService");

        // Test the configuration
        if (bookService != null) {
            System.out.println("BookService bean is successfully configured using constructor and setter injection!");
        } else {
            System.out.println("Failed to configure BookService bean using constructor and setter injection.");
        }
    }
}
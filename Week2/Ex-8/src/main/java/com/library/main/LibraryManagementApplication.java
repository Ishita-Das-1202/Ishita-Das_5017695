package com.library.main;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagementApplication {
    public static void main(String[] args) {
       
        @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        
        BookService bookService = (BookService) context.getBean("bookService");

        
        bookService.someBusinessMethod(); 

        
        System.out.println("BookService bean is successfully configured with AOP!");
    }
}
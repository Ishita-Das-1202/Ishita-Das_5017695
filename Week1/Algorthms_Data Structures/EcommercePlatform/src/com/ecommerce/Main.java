package com.ecommerce;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product("1", "Laptop", "Electronics"),
            new Product("2", "Headphones", "Electronics"),
            new Product("3", "Coffee Maker", "Home Appliances"),
            new Product("4", "Smartphone", "Electronics"),
            new Product("5", "Desk Chair", "Furniture")
        };

        // Sort the products array by productName for binary search
        Arrays.sort(products, (p1, p2) -> p1.getProductName().compareToIgnoreCase(p2.getProductName()));

        // Linear Search
        String searchProductName = "Headphones";
        Product result = Search.linearSearch(products, searchProductName);
        if (result != null) {
            System.out.println("Linear Search: Product found - " + result.getProductName());
        } else {
            System.out.println("Linear Search: Product not found.");
        }

        // Binary Search
        result = Search.binarySearch(products, searchProductName);
        if (result != null) {
            System.out.println("Binary Search: Product found - " + result.getProductName());
        } else {
            System.out.println("Binary Search: Product not found.");
        }
    }
}


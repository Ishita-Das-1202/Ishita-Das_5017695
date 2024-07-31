package com.ecommerce;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Order[] orders = {
            new Order("1", "Alice", 250.0),
            new Order("2", "Bob", 150.0),
            new Order("3", "Charlie", 450.0),
            new Order("4", "Dave", 350.0),
            new Order("5", "Eve", 200.0)
        };

        // Bubble Sort
        Sort.bubbleSort(orders);
        System.out.println("Orders sorted by Bubble Sort:");
        for (Order order : orders) {
            System.out.println(order.getOrderId() + ": " + order.getTotalPrice());
        }

        // Reset the order array for Quick Sort
        orders = new Order[] {
            new Order("1", "Alice", 250.0),
            new Order("2", "Bob", 150.0),
            new Order("3", "Charlie", 450.0),
            new Order("4", "Dave", 350.0),
            new Order("5", "Eve", 200.0)
        };

        // Quick Sort
        Sort.quickSort(orders, 0, orders.length - 1);
        System.out.println("Orders sorted by Quick Sort:");
        for (Order order : orders) {
            System.out.println(order.getOrderId() + ": " + order.getTotalPrice());
        }
    }
}

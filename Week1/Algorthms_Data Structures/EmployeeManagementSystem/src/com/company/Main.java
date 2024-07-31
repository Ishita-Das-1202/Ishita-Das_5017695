package com.company;

public class Main {
    public static void main(String[] args) {
        EmployeeManagement management = new EmployeeManagement(10);

        Employee emp1 = new Employee("E001", "Alice", "Manager", 75000);
        Employee emp2 = new Employee("E002", "Bob", "Developer", 60000);
        Employee emp3 = new Employee("E003", "Charlie", "Designer", 50000);

        // Add employees
        management.addEmployee(emp1);
        management.addEmployee(emp2);
        management.addEmployee(emp3);

        // Traverse and display employees
        System.out.println("Employee List:");
        management.traverseEmployees();

        // Search for an employee
        String searchId = "E002";
        Employee searchResult = management.searchEmployee(searchId);
        if (searchResult != null) {
            System.out.println("Employee found: " + searchResult.getName());
        } else {
            System.out.println("Employee not found.");
        }

        // Delete an employee
        String deleteId = "E003";
        boolean deleteResult = management.deleteEmployee(deleteId);
        if (deleteResult) {
            System.out.println("Employee deleted: " + deleteId);
        } else {
            System.out.println("Employee not found: " + deleteId);
        }

        // Traverse and display employees after deletion
        System.out.println("Employee List after deletion:");
        management.traverseEmployees();
    }
}

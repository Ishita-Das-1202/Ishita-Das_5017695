package com.company;

import java.util.Arrays;

public class EmployeeManagement {
    private Employee[] employees;
    private int size;
    private int capacity;

    public EmployeeManagement(int capacity) {
        this.capacity = capacity;
        this.employees = new Employee[capacity];
        this.size = 0;
    }

    // Add an employee
    public boolean addEmployee(Employee employee) {
        if (size < capacity) {
            employees[size++] = employee;
            return true;
        } else {
            return false;
        }
    }

    // Search for an employee by ID
    public Employee searchEmployee(String employeeId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId().equals(employeeId)) {
                return employees[i];
            }
        }
        return null;
    }

    // Traverse and display all employees
    public void traverseEmployees() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i].getEmployeeId() + ": " + employees[i].getName());
        }
    }

    // Delete an employee by ID
    public boolean deleteEmployee(String employeeId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId().equals(employeeId)) {
                employees[i] = employees[size - 1];
                employees[size - 1] = null;
                size--;
                return true;
            }
        }
        return false;
    }
}

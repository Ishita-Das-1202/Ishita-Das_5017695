package com.example.dependencyinjection;

public class CustomerRepositoryImpl implements CustomerRepository {

    @Override
    public String findCustomerById(String id) {
        // Simulating a database fetch
        if ("123".equals(id)) {
            return "Customer with ID 123: John Doe";
        } else {
            return "Customer not found";
        }
    }
}


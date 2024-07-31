package com.example.dependencyinjection;

public class CustomerService {
    private CustomerRepository customerRepository;

    // Constructor injection
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public String getCustomerInfo(String id) {
        return customerRepository.findCustomerById(id);
    }
}

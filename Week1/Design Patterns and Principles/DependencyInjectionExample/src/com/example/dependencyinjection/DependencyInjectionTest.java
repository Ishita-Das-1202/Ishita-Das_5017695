package com.example.dependencyinjection;

public class DependencyInjectionTest {

    public static void main(String[] args) {
        // Create the repository
        CustomerRepository customerRepository = new CustomerRepositoryImpl();

        // Inject the repository into the service
        CustomerService customerService = new CustomerService(customerRepository);

        // Use the service to get customer information
        String customerInfo = customerService.getCustomerInfo("123");
        System.out.println(customerInfo);  // Output: Customer with ID 123: John Doe

        customerInfo = customerService.getCustomerInfo("999");
        System.out.println(customerInfo);  // Output: Customer not found
    }
}

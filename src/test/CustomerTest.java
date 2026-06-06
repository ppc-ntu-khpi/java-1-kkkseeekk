package test;

import domain.Customer;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();

        System.out.println("Default Customer Info");
        customer.displayCustomerInfo();
        customer.setID(81);
        customer.setStatus(false);
        customer.setTotal(2377.67);

        System.out.println("\n Updated Customer Info");
        customer.displayCustomerInfo();
        
        System.out.println("\n Testing Validation");
        customer.setTotal(-500); 
    }
}
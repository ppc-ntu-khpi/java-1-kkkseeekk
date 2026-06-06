[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=24051287)
# Створення класів

Це друга лабораторна робота в нашому курсі з ООП, в ході якої ви маєте отримати навички зі створення класів та тестування їх працездатності. Робота дуже маленька та складається з двох завдань.

## 1. Код класу `Customer.java` (пакет `domain`)

package domain;

public class Customer {
    private int id;
    private boolean isNew;
    private double total;

    public Customer() {
        this.id = 1;
        this.isNew = true;
        this.total = 3101.0;
    }

    public void displayCustomerInfo() {
        System.out.println("Customer ID: " + id);
        System.out.println("Is new customer: " + isNew);
        System.out.println("Total purchases are: $" + total);
    }

    public void setID(int id) {
        if (id > 0) {
            this.id = id;
        } else {
            System.out.println("Error: ID must be positive!");
        }
    }

    public void setStatus(boolean isNew) {
        this.isNew = isNew;
    }

    public void setTotal(double total) {
        if (total >= 0) {
            this.total = total;
        } else {
            System.out.println("Error: Total purchases cannot be negative!");
        }
    }

    public int getID() { return id; }
    public boolean isNew() { return isNew; }
    public double getTotal() { return total; }
}

## 2. Код класу `CustomerTest.java` (пакет `test`)

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

## 3. Результат виконання програми
<https://github.com/ppc-ntu-khpi/java-1-kkkseeekk/blob/main/Solution/%D0%9F%D1%801%D0%9A%D0%BE%D0%B7%D0%BB%D0%BE%D0%B2%D0%B0%D0%A1%D0%BA%D1%80%D1%96%D0%BD%D1%88%D0%BE%D1%82.png>

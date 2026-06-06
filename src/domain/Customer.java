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
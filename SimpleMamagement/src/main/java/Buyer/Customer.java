package Buyer;
// Attributes
// Constructor
// Methods
public class Customer {
    // Attributes
    
    private String name, customerType;
    private double toatalAmount, RemainingAmount;
    private int RegisteredQuantities, ID;
    
    // Constructor
    
    public Customer(String name, String customerType, double toatalAmount, double RemainingAmount, int RegisteredQuantities, int ID) {
        this.name = name;
        this.customerType = customerType;
        this.toatalAmount = toatalAmount;
        this.RemainingAmount = RemainingAmount;
        this.RegisteredQuantities = RegisteredQuantities;
        this.ID = ID;
    }
    
    // Methods

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public double getToatalAmount() {
        return toatalAmount;
    }

    public void setToatalAmount(double toatalAmount) {
        this.toatalAmount = toatalAmount;
    }

    public double getRemainingAmount() {
        return RemainingAmount;
    }

    public void setRemainingAmount(double RemainingAmount) {
        this.RemainingAmount = RemainingAmount;
    }

    public int getRegisteredQuantities() {
        return RegisteredQuantities;
    }

    public void setRegisteredQuantities(int RegisteredQuantities) {
        this.RegisteredQuantities = RegisteredQuantities;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Customer name : " + name 
                + "\nCustomer Type :" + customerType 
                + "\ntoatal Amount :" + toatalAmount 
                + "\nRemaining Amount :" + RemainingAmount 
                + "\nRegistered Quantities :" + RegisteredQuantities 
                + "\nID :" + ID;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.ID;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Customer other = (Customer) obj;
        return this.ID == other.ID;
    }
    
    
}

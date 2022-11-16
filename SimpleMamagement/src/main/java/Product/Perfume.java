package Product;

public class Perfume {
    // Attributes
    
    private String perfumeType;
    private double unitPrice;
    private int quantity;
    private int ID;

    // Constructor
    
    public Perfume(String perfumeType, double unitPrice, int quantity, int ID) {
        this.perfumeType = perfumeType;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.ID = ID;
    }
    
    // Methods
    
    public String getPerfumeType() {
        return perfumeType;
    }

    public void setPerfumeType(String perfumeType) {
        this.perfumeType = perfumeType;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getID() {
        return ID;
    }
    
    public void setID(int ID) {    
        this.ID = ID;
    }

    /**
     * To display data
     * @return 
     */
    @Override
    public String toString() {
        return "Perfume Type : " + perfumeType
                +"\nUnit Price : " + unitPrice
                +"\nQuantity : " + quantity
                +"\nID This Type : " + ID;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Perfume other = (Perfume) obj;
        return this.ID == other.ID;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }
}

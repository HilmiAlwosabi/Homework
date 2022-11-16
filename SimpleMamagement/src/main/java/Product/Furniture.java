package Product;

public class Furniture extends Perfume{
    // Attributes
    
    public String odor;
    
    // Constructor
    
    public Furniture(String odor, String perfumeType, double unitPrice, int quantity, int ID) {
        super(perfumeType, unitPrice, quantity, ID);
        this.odor = odor;
    }
    
    // Methods

    public String getOdor() {
        return odor;
    }

    public void setOdor(String odor) {
        this.odor = odor;
    }

    @Override
    public String toString() {
        return "Odor : " + odor
                + "\n" + super.toString();
    }
}

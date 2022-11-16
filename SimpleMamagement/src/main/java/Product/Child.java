package Product;

public class Child extends Perfume{
    // Attributes
    
    private String color;
    
    // Constructor

    public Child(String color, String perfumeType, double unitPrice, int quantity, int ID) {
        super(perfumeType, unitPrice, quantity, ID);
        this.color = color;
    }

    // Methods

    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    @Override
    public String toString() {
        return "Color : " + color
                + "\n" + super.toString();
    }   
}

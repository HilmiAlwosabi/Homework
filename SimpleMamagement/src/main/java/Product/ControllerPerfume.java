package Product;

import Interface.Calculator;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ControllerPerfume implements Calculator{
    // Attributes
    
    private Child[] childGroub;
    private Furniture[] furnitureGroub;
    private int furnitureCounter, childCounter;
    
    // Constructor
    
    public ControllerPerfume() throws FileNotFoundException {
        childGroub = new Child[20];
        furnitureGroub = new Furniture[20];
        furnitureCounter = 0;
        childCounter = 0;
        readFile();
    }
    
    // Methods
    /**
     * Add data to attributes
     * @param perfumeType
     * @param unitPrice
     * @param quantity
     * @param ID
     * @param type
     * Decide what kind of fragrance you will add
     * @param decision
     * @return 
     */
    public boolean addPerfume(String type, String perfumeType, double unitPrice, int quantity, int ID, int decision){
        if(decision == 1){
            Child child = new Child(type, perfumeType, unitPrice, quantity, ID);
            childGroub[childCounter] = child;
            childCounter++;
            return true;
        }
        if(decision == 2){
            Furniture furniture = new Furniture(type, perfumeType, unitPrice, quantity, ID);
            furnitureGroub[furnitureCounter] = furniture;
            furnitureCounter++;
            return true;
        }
        else
        return false;
    }
    
    public Child[] viewChild(){
            return childGroub;
    }
    
    public Furniture[] viewFurniture(){
            return furnitureGroub;
    }
    
    public Child searchChild(int id){
        int i = 0;
        boolean found = false;
        while(!found && i < childGroub.length){
            if(childGroub[i] != null){
                if(childGroub[i].getID() == id){
                    found = true;
                }
                else i++;
            }
            else i++;
        }
        if(found) return childGroub[i];
        else return null;
    }
    
    public Furniture searchFurniture(int id){
        int i = 0;
        boolean found = false;
        while(!found && i < furnitureGroub.length){
            if(furnitureGroub[i] != null){
                if(furnitureGroub[i].getID() == id){
                    found = true;
                }
                else i++;
            }
            else i++;
        }
        if(found) return furnitureGroub[i];
        else return null;
    }
    
    /**
     *
     * @return
     */
    @Override
    public void amountQuantity(){
        double sumChild = 0;
        for(int i=0; i < childGroub.length; i++){
            if(childGroub[i] != null){
               sumChild = (childGroub[i].getQuantity()*dozen)*childGroub[i].getUnitPrice();
                System.out.println(childGroub[i].getColor() + " = " + sumChild);
            }
        }
        double sumFurniture = 0;
        for(int i=0; i < furnitureGroub.length; i++){
            if(furnitureGroub[i] != null){
               sumFurniture = (furnitureGroub[i].getQuantity()*dozen)*furnitureGroub[i].getUnitPrice();
               System.out.println(furnitureGroub[i].getOdor() + " = " + sumFurniture);
            }
        }
        
    }
    
    public boolean RepeatCheck(Perfume perfume, int decision){
        if(decision == 1){
            for(int i=0; i<childCounter; i++){
                if(childGroub[i].equals(perfume))
                    return true;
            }
            return false;
        }
        if(decision == 2){
            for(int i=0; i<furnitureCounter; i++){
                if(furnitureGroub[i].equals(perfume))
                    return true;
            }
            return false;
        }
        return false;
    }
    
    public void readFile() throws FileNotFoundException{
        Scanner in = new Scanner(new File("C:\\Users\\HP\\Documents\\NetBeansProjects\\SimpleMamagement\\src\\main\\java\\Product\\ProductData.txt"));
        while(in.hasNextLine()){
            String type, perfumeType;
            double unitPrice;
            int qoantity, ID;
            type = in.next();
            perfumeType = in.next();
            unitPrice = in.nextDouble();
            qoantity = in.nextInt();
            ID = in.nextInt();
            
            if(ID >= 1&& ID <= 20)
            addPerfume(type, perfumeType, unitPrice, qoantity, ID, 1);
            if(ID >= 20 && ID <= 40)
            addPerfume(type, perfumeType, unitPrice, qoantity, ID, 2);
        }
        in.close();
    }
    
    public void writeFile() throws FileNotFoundException{
        PrintWriter writer = new PrintWriter(new File("C:\\Users\\HP\\Documents\\NetBeansProjects\\SimpleMamagement\\src\\main\\java\\Product\\ProductData.txt"));
        for(int i=0; i < childCounter; i++){
            writer.write("\n" + childGroub[i].getColor() + " " + childGroub[i].getPerfumeType() + " " + childGroub[i].getUnitPrice() + " " + childGroub[i].getQuantity() + " " + childGroub[i].getID());
        }
        for(int i=0; i < furnitureCounter; i++){
            writer.write("\n" + furnitureGroub[i].getOdor() + " " + furnitureGroub[i].getPerfumeType() + " " + furnitureGroub[i].getUnitPrice() + " " + furnitureGroub[i].getQuantity() + " " + furnitureGroub[i].getID());
        }
        writer.close();
    }
}

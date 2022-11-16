package Product;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class ViewProduct {
    // Attributes
    
    private ControllerPerfume control;
    private Scanner in;
    
    // Constructor
    
    public ViewProduct() throws FileNotFoundException{
        control = new ControllerPerfume();
        in = new Scanner(System.in);
    }

    // Methods
    
    public void services(){
        System.out.println("|-----------Products Section----------|");
        System.out.println("|                                     |");
        System.out.println("|      What service do you want?      |");
        System.out.println("|                                     |");
        System.out.println("|           ---------------           |");
        System.out.println("| (1)  Add a new perfume              |");
        System.out.println("| (2)  Search for perfume data        |");
        System.out.println("| (3)  Perfume Show                   |");
        System.out.println("| (4)  Calculate amount of products   |");
        System.out.println("| (5)  Saving data                    |");
        System.out.println("| (6)  Exit section                   |");
        System.out.println("|           ---------------           |");
        System.out.println("|                                     |");
        System.out.println("|-------------------------------------|");
    }
    
    public void start() throws FileNotFoundException{
        services();
        boolean User = true;
        while(User){
            System.out.print("Enter number of service --> ");
            int service = in.nextInt();
            switch(service){
                case 1: add(); break;
                case 2: search(); break;
                case 3: view(); break;
                case 4: control.amountQuantity(); break;
                case 5: control.writeFile(); break;
                case 6: User = false; break;
            }
        }
    }
    
    public void add(){
        String perfumeType = "null";
        boolean repeat = true;
        System.out.print("Enter the name of perfume --> ");
        String name = in.next();
        System.out.println("The type of perfumes available are\nChildre's Perfumes Enter(1)\nFurniture Perfumes Enter(2)");
        System.out.print("Enter the type of perfume --> ");
        int decision = in.nextInt();
        System.out.print("Enter the price of the piece --> ");
        double unitPrice = in.nextDouble();
        System.out.print("Enter the quantity --> ");
        int quantity = in.nextInt();
        System.out.print("Enter the ID -->");
        int ID = in.nextInt();
        if(decision == 1) {
            perfumeType = "Child";
            repeat = control.RepeatCheck(new Child(name, perfumeType, unitPrice, quantity, ID), decision);
        }
        if(decision == 2){
            perfumeType = "Furniture";
            repeat = control.RepeatCheck(new Furniture(name, perfumeType, unitPrice, quantity, ID), decision);
        }
        
        if(repeat){System.out.println("Sorry, there is an existing perfume with the same data");}
        else{
            control.addPerfume(name, perfumeType, unitPrice, quantity, ID, decision);
            System.out.println("Added");
        }
    }
    
    public void view(){
        System.out.println("-------------------------");
        System.out.println("""
                           What type do you want to display
                           Children's Perfumes Enter(1)
                           Furniture Perfumes Enter(2)
                           All data Enter(3)""");
        System.out.print("Enter --> ");
        int decision = in.nextInt();
        Child[] child = control.viewChild();
        Furniture[] furniture = control.viewFurniture();
        
        if(decision == 1){
            System.out.println("-------------------------");
            for (int i = 0;; i++) {
                if(child[i] != null){
                    System.out.println(child[i].toString());
                    System.out.println("-------------------------");
                }
                else {
                    System.out.println("None yet");break;
                }
            }
        }
        if(decision == 2){
            System.out.println("-------------------------");
            for (int i = 0;; i++){
                if(furniture[i] != null){
                    System.out.println(furniture[i].toString());
                    System.out.println("-------------------------");
                }
                else {
                    System.out.println("None yet");break;
                }
            }
        }
        if(decision == 3){
            System.out.println("-------------------------");
            for (int i = 0;; i++) {
                if(child[i] != null){
                    System.out.println(child[i].toString());
                    System.out.println("-------------------------");
                }
                if(furniture[i] != null){
                    System.out.println(furniture[i].toString());
                    System.out.println("-------------------------");
                }
                else {
                    System.out.println("None yet");break;
                }
            }
        }
    }
    
    public void search(){
        System.out.print("Enter ID Perfume --> ");
        int ID = in.nextInt();
        
            Child child = control.searchChild(ID);
            Furniture furniture = control.searchFurniture(ID);
        
        if(child != null){
            System.out.println("-------------------------");
            System.out.println(child.toString());
            System.out.println("-------------------------");
        }
        else{
            System.out.println("Not found");
        }
        if(furniture != null){
            System.out.println("-------------------------");
            System.out.println(furniture.toString());
            System.out.println("-------------------------");
        }
        else{
            System.out.println("Not found");
        }
    }
}

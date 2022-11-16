package Buyer;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class ViewBuyer {
    // Attributes

    ControllerCustomer control;
    Scanner in;
    
    // Constructor
    
    public ViewBuyer() throws FileNotFoundException{
        control = new ControllerCustomer();
        in = new Scanner(System.in);
    }
    
    // Methods
    
    public void services(){
        System.out.println("|-----------Customer Section----------|");
        System.out.println("|                                     |");
        System.out.println("|      What service do you want?      |");
        System.out.println("|                                     |");
        System.out.println("|           ---------------           |");
        System.out.println("| (1)  Add a new customer             |");
        System.out.println("| (2)  Search for customer data       |");
        System.out.println("| (3)  Customer Show                  |");
        System.out.println("| (4)  Saving data                    |");
        System.out.println("| (5)  Show total amounts             |");
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
                case 4: control.writeFile(); break;
                case 5: System.out.println(control.calcuateAmount()); break;
                case 6: User = false; break;
            }
        }
    }
    
    public void add(){
        String customerType = "null";
        boolean repeat = true;
        System.out.print("Enter the name --> ");
        String name = in.next();
        
        System.out.println("The type of perfumes available are\nSmall shop Enter(1)\nTrade center Enter(2)");
        System.out.print("Enter the one of them --> ");
        int decision = in.nextInt();
        if(decision == 1) {customerType = "Small";}
        if(decision == 2){customerType = "Center";}
        
        System.out.print("Enter his toatal amount --> ");
        double toatalAmount = in.nextDouble();
        System.out.print("Enter his unpaid amount --> ");
        double RemainingAmount = in.nextDouble();
        System.out.print("Enter his registered quantities --> ");
        int RegisteredQuantities = in.nextInt();
        int ID = control.creatId();
        System.out.println("his ID = " + ID);
        
        repeat = control.RepeatCheck(new Customer(name, customerType, toatalAmount, RemainingAmount, RegisteredQuantities, ID));
        if(repeat){System.out.println("Sorry, there is an existing perfume with the same data");}
        else{
            control.addCustomer(name, customerType, toatalAmount, RemainingAmount, RegisteredQuantities, ID);
            System.out.println("Added");
        }
    }
    
    public void view(){
        Customer []customer = control.viewCustomer();
        
        System.out.println("___________________________");
        for(int i=0; i<20; i++){
            if(customer[i] != null){
                System.out.println(i+1 + " ) " + customer[i].toString());
                System.out.println("___________________________");
            }
        }
    }
    
    public void search(){
        System.out.print("Enter customer ID : ");
        int id = in.nextInt();
        Customer customer = control.searchCustomer(id);
        
        if(customer != null){
            System.out.println("___________________________");
            System.out.println(customer.toString());
            System.out.println("___________________________");
        }
        else
            System.out.println("Not found");
    }
}

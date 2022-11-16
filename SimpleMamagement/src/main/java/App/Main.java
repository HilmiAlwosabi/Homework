package App;

import Buyer.ViewBuyer;
import CompanyEmployee.*;
import Product.*;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner in = new Scanner(System.in);
        
        while(true){
            
            System.out.println("|--------------Section----------------|");
            System.out.println("|                                     |");
            System.out.println("|      What section do you want?      |");
            System.out.println("|                                     |");
            System.out.println("|           ---------------           |");
            System.out.println("| (1)  Employees                      |");
            System.out.println("| (2)  Perfumes                       |");
            System.out.println("| (3)  Customers                      |");
            System.out.println("| (4)  Exit program                   |");
            System.out.println("|           ---------------           |");
            System.out.println("|                                     |");
            System.out.println("|-------------------------------------|");
            
            System.out.print("Enter number of service --> ");
            int service = in.nextInt();
            
            switch(service){
                case 1: 
                    ViewEmployee VEmployee = new ViewEmployee(); 
                    VEmployee.start();
                    break;
                case 2:
                    ViewProduct VPerfume = new ViewProduct();
                    VPerfume.start();
                    break;
                case 3: 
                    ViewBuyer VBuyer = new ViewBuyer();
                    VBuyer.start();
                    break;
                case 4: System.exit(0);
                default: System.out.println("\nWrong");
                    break;
            }

        }
    }
}

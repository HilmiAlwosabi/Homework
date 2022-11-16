package Buyer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ControllerCustomer {
    // Attributes

    private Customer[] customerGroub;
    private int customerCounter;
    
    // Constructor
    
    public ControllerCustomer() throws FileNotFoundException{
        customerGroub = new Customer[100];
        customerCounter = 0;
        readFile();
    }
    
    // Methods
    
    public boolean addCustomer(String name, String customerType, double toatalAmount, double RemainingAmount, int RegisteredQuantities, int ID){
        if(customerCounter < customerGroub.length){
            Customer customer = new Customer(name, customerType, toatalAmount, RemainingAmount, RegisteredQuantities, ID);
            customerGroub[customerCounter] = customer;
            customerCounter++;
            return true;
        }
        else
            return false;
    }
    
    public int creatId(){
        int i=0, max=0;
        while(i < customerGroub.length){
             if(customerGroub[i] != null){
                 if(customerGroub[i].getID() > max){
                     max = customerGroub[i].getID();
                 }
                 else
                      i++;
             }
             else
                 i++;
        }
        return max+1;
    }
    
    public boolean RepeatCheck(Customer customer){
        for(int i=0; i < customerCounter; i++){
            if(customerGroub[i].equals(customer))
                return true;
        }
        return false;
    }

    public Customer[] viewCustomer(){
        return customerGroub;
    }

    public Customer searchCustomer(int ID){
        int i = 0;
        boolean found = false;
        while(!found && i < customerGroub.length){
            if(customerGroub[i] != null){
                if(customerGroub[i].getID() == ID){
                    found = true;
                }
                else
                    i++;
            }
            else
                i++;
        }
        if(i < customerGroub.length){
            return customerGroub[i];
        }
        else
            return null;
    }
    
    public String calcuateAmount(){
        int i = 0;
        double total = 0, debt = 0;
        while(i < customerGroub.length){
            if(customerGroub[i] != null){
                total += customerGroub[i].getToatalAmount();
                debt += customerGroub[i].getRemainingAmount();
            }
            else
                i++;
            i++;
        }
        return "The total = " + total
                + "\nThe debt = " + debt
                + "\nresulting = " + (total - debt) ;
    }
    
    public void readFile() throws FileNotFoundException{
        Scanner in = new Scanner(new File("C:\\Users\\HP\\Documents\\NetBeansProjects\\SimpleMamagement\\src\\main\\java\\Buyer\\CustomerData.txt"));
        while(in.hasNextLine()){
            addCustomer(in.next(), in.next(), in.nextDouble(), in.nextDouble(), in.nextInt(), in.nextInt());
        }
        in.close();
    }
    
    public void writeFile() throws FileNotFoundException{
        PrintWriter writer = new PrintWriter(new File("C:\\Users\\HP\\Documents\\NetBeansProjects\\SimpleMamagement\\src\\main\\java\\Buyer\\CustomerData.txt"));
        for(int i=0; i < customerGroub.length; i++){
            if(customerGroub[i] != null){
            writer.write("\n" + customerGroub[i].getName() + " " + customerGroub[i].getCustomerType() + " " + customerGroub[i].getToatalAmount() + " " + customerGroub[i].getRemainingAmount() + " " + customerGroub[i].getRegisteredQuantities() + " " + customerGroub[i].getID());
            }
        }
        writer.close();
    }
}

package HW6;

import java.util.Scanner;

public class Q1 {
    /*Write a program that reads an initial investment balance and an interest rate, 
      then prints the number of years it takes for the investment to reach one million dollars.*/
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        double investmentalance;
        double interestRate;
        int year=0;
        System.out.print("Enter the initial investment balance : ");
            investmentalance=in.nextDouble();
        System.out.print("Enter the interest rate in the day: ");
            interestRate=in.nextDouble();
            for(int i=1;;i++){
                for(int j=1;j<=360;j++){
                    investmentalance+=interestRate;
                
                }
                year++;
                if(investmentalance>=1000000){
                    System.out.println("Investmentalance"+investmentalance+"in the year"+year);
                    break;
                }
                    
            }
        
    }
    
}

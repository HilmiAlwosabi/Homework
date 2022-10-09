package HW6;

import java.util.Scanner;

public class Q7 {
        /*Write a program that reads a number and prints all of its binary digits: Print 
the remainder number % 2, then replace the number with number / 2. Keep 
going until the number is 0. For example, if the user provides the input 13, the 
output should be*/
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter number : ");
        int number = in.nextInt();
        
        for(;;){
            if(number == 0) break;
            int digit = (number%2 == 1) ? 1 : 0 ;
            number /= 2;     
            System.out.println("The binary of number is "+digit);
        }
    }
    
}

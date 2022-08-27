
package Homework3;

import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        byte a;
        System.out.println("Enter the number");
        a=in.nextByte();
        if(a<0)
            System.out.println("The number is - ");
        else if(a>0)
            System.out.println("The number is + ");
        else
            System.out.println("The number is 0 ");
            
        
    }
    
}

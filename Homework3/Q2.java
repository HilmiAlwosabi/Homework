
package Homework3;
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        char letter[] = new char[] {'a','c','e','g','b','d','f','h'};
        
        System.out.println("Enter the letter and then the number.");
        System.out.print("Enter the letter : ");
        char letter1 = in.next().charAt(0);
        System.out.print("Enter the number: ");
        byte num = in.nextByte();
        
        for (int i=0; i<8; i++)
            if (letter1 == letter[i] && i<4){
                if (num%2 == 1) { System.out.println("Black"); break;}
                else { System.out.println("White"); break;}
            }
            else {
                if (num%2 == 1) { System.out.println("White"); break;}
                else { System.out.println("Black"); break;}
            }  
        
    }
}

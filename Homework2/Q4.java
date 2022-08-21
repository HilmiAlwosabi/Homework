
package Homework2;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        float n1,n2,n3,avg;
        System.out.println("Enter three numbers please");
        n1=input.nextFloat();
        n2=input.nextFloat();
        n3=input.nextFloat();
        avg=(n1+n2+n3)/3;
        System.out.printf("avg = (%f +%f +%f) /3 = ",n1,n2,n3 + avg);
    }
    
}

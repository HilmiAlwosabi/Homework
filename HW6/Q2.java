package HW6;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
     //a. The sum of all even numbers between 2 and 100
        int sum=0;
        for(int i=2;i<=100;i++){
            if(i%2==0)
                sum+=i;
                System.out.print("The sum of all even numbers from 2-100="+sum);
        }
     //b. The sum of all odd numbers between a and b, where a and b are inputs.
        int a,b;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the min numder ");
        a=in.nextInt();
        System.out.print("Enter the max numder ");
        b=in.nextInt();
        System.out.print("The sum of all odd numbers from a-b ="+sum);
        
     //c.The sum of all odd digits of an input.
        System.out.print("Enter eny number please :");
        b=in.nextInt();
        int utensil;
        sum=0;
        for(;;){
            utensil=b%10;
            sum += (utensil%2 == 1)? utensil : 0 ;
            b /= 10;
            
            if(b == 0) { break; }
        }
        
        System.out.println("The sum of all odd digits is = " + sum);
        
        
        
    }
}

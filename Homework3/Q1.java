
package Homework3;
import java.math.BigDecimal;
public class Q1 {
    public static void main(String[] args) {
        //a
        {int n=1;
         int m=-1;
         if(n<-m)
                System.out.println("n="+n);
         else
                System.out.println("m="+m);
        }
        //b
        {int n=1;
         int m=-1;
         if(-n>=m)
                System.out.println("n="+n);
         else
                System.out.println("m="+m);
        }
     {
        // c
        double x = 0; 
        double y = 1; 
        if (Math.abs(x - y) < 1)
            System.out.println("x="+x);  
        else
            System.out.println("y="+y);
     }
     {//d
        double x = Math.sqrt(2); 
        double y = 2; 
        if (x * x == y) 
         System.out.println("x="+x); 
        else  System.out.println("y="+y);

     }
    }
 }


package Homework3;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float num[]= new float[3];
        System.out.println("Enter three numbers please");
        for(int i=1;i<=3;i++){
            System.out.print("The number "+i+" = ");
            num[i-1]=in.nextFloat();
        }
            
        if(num[0]<num[1]&&num[1]<num[2])
            System.out.println("in order "+num[0]+" "+num[1]+" "+num[2]);
        else if(num[0]>num[1]&&num[1]>num[2])
            System.out.println("in order "+num[0]+" "+num[1]+" "+num[2]);
        else
            System.out.println("Neither "+num[0]+" "+num[1]+" "+num[2]);
    }
    
}


package Homework3;

import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float num[]= new float[3];
        String an;
        System.out.println("Enter three numbers please");
        for(int i=1;i<=3;i++){
            System.out.print("The number "+i+" = ");
            num[i-1]=in.nextFloat();
        }
            
        an=(num[0]<num[1]&&num[1]<num[2])? "Increasing" :(num[0]>num[1]&&num[1]>num[2])? "Decreasing" : "Neither";
        System.out.println("--->"+an);
    }
    
}

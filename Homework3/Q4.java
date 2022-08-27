
package Homework3;

import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s;
        int num;
        System.out.println("A program that reads the digits of the number");
        System.out.print("Please enter the number >100000000 \n -->");
        num=in.nextInt();
        num=(num<0)? num*-1 : num;
        s=String.valueOf(num);
        System.out.println("number is "+s.length()+" digits");
        
    }
    
}

package Homework2;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
     Scanner in=new Scanner(System.in);
        System.out.println("The area of circle = π*r*r");//x=π=3.14 and r is Diameter.
        float area,perimeter,x=3.14f,r;
        System.out.println("Enter the Diameter");
        r=in.nextFloat();
        area=x*r*r;
        perimeter=x*r;
        System.out.println("area="+area+"\nperimeter="+perimeter);
    }
}

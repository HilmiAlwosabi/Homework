
package Homework2;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("please enter the width ");
        float width=in.nextFloat();
        System.out.println("please enter the height ");
        float height=in.nextFloat();
        
         double area=(width*height);
         double perimeter=2*(width+height);
        System.out.println("area ="+area);
        System.out.println("perimeter = "+ perimeter);
    }
    
}


package Homework2;
import java.util.Scanner;
import java.math.BigDecimal;
public class Q9 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("please enter the first number");
        int number1=in.nextInt();
        System.out.println("please enter the secand number");
        int number2=in.nextInt();
        System.out.println("number1+number2"+(number1+number2));
        System.out.println("number1-number2"+(number1-number2));
        System.out.println("number1*number2"+(number1*number2));
        System.out.println("the avg"+(number1+number2)/3);
        System.out.println("The distance ="+ Math.abs(number1));
        System.out.println("The distance ="+ Math.abs(number2));
        if (number1>number2){
            System.out.println("the max is"+ number1);
            System.out.println("the min is"+ number2);
            }
        else if (number2>number1){
            System.out.println("the max is"+ number2);
            System.out.println("the min is"+ number1);      
            }
        else
            System.out.println("number1=number2");   
    }
}

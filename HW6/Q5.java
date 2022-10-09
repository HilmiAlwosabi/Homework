package HW6;

import java.util.Scanner;

public class Q5 {
    /*Write a program that reads a word and prints the number of vowels in the 
      word. For this exercise, assume that a e i o u y are vowels. For example, if the 
      user provides the input "Harry", the program prints 2 vowels.*/
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        char []vowels = new char[] {'a','e','i','o','u','y'};
        int count = 0;
        
        System.out.print("Enter any text ... # ");
        String text = in.nextLine();
        
        for(int i=0; i < text.length() ; i++)
            for(int j=0; j < 6; j++)
                if(text.charAt(i) == vowels[j])
                    count++;
        
        System.out.println("The number of Vowels in text = " + count);

        
        
    }
    
}

package HW6;

import java.util.Scanner;

public class Q3andQ4 {
    //Write a program that reads a word and prints the word in reverse
    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter any word  : ");
        String word = in.next();
        System.out.println(word.length());
        for(int i=0; i < word.length(); i++){  
            System.out.println(word.charAt(i));
        }
        //Write a program that reads a word and prints each character of the word on a separate line
        for(int i=word.length()-1 ; i >= 0; i--)
            System.out.print(word.charAt(i));
    }
    
}

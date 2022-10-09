package HW5;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        tallyCounter Q_2 = new tallyCounter();
    
    Scanner in =new Scanner(System.in);
        System.out.print("Enter the leight of counter : ");
    int mx=in.nextInt();
        Q_2.setmax(mx);
        Q_2.setNumber();
        System.out.println(Q_2.getNumber());
        Q_2.setNumber();
        System.out.println(Q_2.getNumber());
        Q_2.setNumber();
        System.out.println(Q_2.getNumber());
                
        Q_2.setNumber();
        System.out.println(Q_2.getNumber());
    }
    
}

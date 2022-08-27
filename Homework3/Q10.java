
package Homework3;

import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        byte n_mounth;
        System.out.println("please enter the  mounth`s number");
        n_mounth=in.nextByte();
        if(n_mounth>=1||n_mounth<=12){
        if(n_mounth==4||n_mounth==6||n_mounth==9||n_mounth==11)
            System.out.println("the days of manth are 30 days");
        else if(n_mounth==1||n_mounth==3||n_mounth==5||n_mounth==7||n_mounth==8||n_mounth==10||n_mounth==12)
            System.out.println("the days of manth are 31 days");
        else
            System.out.println("the days of manth are 28 or 29 days");
        } 
        else
            System.out.println("the number if manth not true please try agian"); 
    }
    
}

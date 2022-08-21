
package com.mycompany.hilmi;


public class Q5 {
    public static void main(String[] args) {
        char name[] = new char[] {'H','i','l','m','i'};                         //5
        for (int i=0;i<=2 ;i++)
           { 
              for(int j=0;j<=8;j++) {
                if(i==1&&j==2||i==1&&j==3||i==1&&j==4||i==1&&j==5||i==1&&j==6)
                    System.out.print(name[j-2]);
                else{
                    System.out.print("*");
                }
                    
              }
               System.out.print("\n");
               
           }
    }
    
}

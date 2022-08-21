
package com.mycompany.hilmi;


public class Q4 {
    public static void main(String[] args) {
        System.out.println("راتب الموظف في ثلاث سنوات");                         //4
        float m=1000;
        for (int i=1;i<=3;i++)
            {                                
                m+=(m/100)*5;
                System.out.println("in the "+ i +" year is :"+m);
                
            }
    }
    
}


package Homework3;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Q8 {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
    String name;
            System.out.print("please enter worker`s name \n-->");
        name=in.nextLine();
    double salary,whours ,p_hour$,hour_p;
            System.out.print("Enter the employee`s working hours\n-->");
        whours=in.nextFloat();
            System.out.print("Enter the working rate per hour by $\n-->");
        p_hour$=in.nextFloat();
        hour_p=(whours>40)? (whours-40)*(p_hour$*1.5f): 0;
        whours=(whours*p_hour$);
        salary=whours+hour_p;

            JOptionPane.showMessageDialog(null,"|-----------------------------------------------------------------|\n"
                                              +"| A sum of money is prid #" + salary +"$                           |\n"
                                              +"| to the worker *"+name+"* for his working hours\n"
                                              +"|-----------------------------------------------------------------|\n");
        
        
        
            
        
    }
    
}

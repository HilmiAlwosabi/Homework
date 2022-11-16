package CompanyEmployee;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ControlEmployee {
    private Employee[] employee;
    private int numOfEmployee;
    
    public ControlEmployee() throws FileNotFoundException{
        employee = new Employee[20];
        numOfEmployee = 0;
        readFile();
    }
    
    public boolean addNewEmployee(String txt[], int number[]){
        if(numOfEmployee<employee.length){
            Employee emp = new Employee(txt, number);
            employee[numOfEmployee] = emp;
            numOfEmployee++;
            return true;
        }
            return false;
    }
    
    public Employee[] viewEmployees(){
        return employee;
    }
    
    public Employee searchEmployee(int id){
        int i = 0;
        boolean found = false;
        while(!found && i < employee.length){
            if(employee[i] != null){
                if(employee[i].getID() == id){
                    found = true;
                }
                else
                    i++;
            }
            else
                i++;
        }
        if(i < employee.length)
            return employee[i];
        else
            return null;
    }
    
    public int creatId(){
        int i=0, max=0;
        while(i < employee.length){
             if(employee[i] != null){
                 if(employee[i].getID() > max){
                     max = employee[i].getID();
                 }
                 else
                      i++;
             }
             else
                 i++;
        }
        return max+1;
    }
    
    public boolean RepeatCheck(Employee emp){
        for(int i=0; i < numOfEmployee; i++){
            if(employee[i].equals(emp))
                return true;
        }
        return false;
    }
    
    public void readFile() throws FileNotFoundException{
        Scanner in = new Scanner(new File("C:\\Users\\HP\\Documents\\NetBeansProjects\\SimpleMamagement\\src\\main\\java\\CompanyEmployee\\EmpData.txt"));
        while(in.hasNextLine()){
            String []txt = new String[3];
            int []number = new int[4];
            
            txt[0] = in.next(); // first name
            txt[1] = in.next(); // last name
            number[0] = in.nextInt(); // Age
            txt[2] = in.next(); // phone number
            number[1] = in.nextInt(); // join date
            number[2] = in.nextInt(); // Salary
            number[3] = in.nextInt(); // ID
            
            addNewEmployee(txt, number);
        }
        in.close();
    }
    
    public void writeFile() throws FileNotFoundException{
        PrintWriter writer = new PrintWriter(new File("C:\\Users\\HP\\Documents\\NetBeansProjects\\SimpleMamagement\\src\\main\\java\\CompanyEmployee\\EmpData.txt"));
        
        for(int i=0; i<numOfEmployee; i++){
            writer.write("\n" + employee[i].getfName() + " " + employee[i].getlName() + " " + employee[i].getAge() + " " + employee[i].getPhoneNumber() + " " + employee[i].getJoinDate() + " " + employee[i].getSalary() + " " + employee[i].getID());
        }
        writer.close();
    }
}

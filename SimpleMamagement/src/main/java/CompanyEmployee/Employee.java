package CompanyEmployee;

import java.util.Objects;

public class Employee extends Person{
    
    private int salary, ID;
    
    public Employee(){}
    
    public Employee(String txt[], int number[]){
        super(txt[0], txt[1], txt[2], number[0], number[1]);
        salary = number[2];
        ID = number[3];
    }

    @Override
    public String toString(){
        return "Name : " + getfName() + " " + getlName()
                + "\nID : " + getID()
                + "\nAge : " + getAge()
                + "\nPhone Number : " + getPhoneNumber()
                + "\nJoine Date : " + getJoinDate()
                + "\nSalary : " + getSalary();
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee emp = (Employee) o;
        return ID == emp.ID;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + this.salary;
        hash = 83 * hash + this.ID;
        return hash;
    }
    
    
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    
}

package HW5;

public class BankAccountTester {
    private int balance;

    public BankAccountTester() {
        balance = 1000;
        balance -= 500;
        balance -= 400;
        System.out.println("Q3 the balance = " + balance);
    }

    public BankAccountTester(int balance) {
        this.balance = balance;
    }
    
    
    public double addinterest(double increase){
        return balance+=balance*(increase/100);
        
    }
    
    public void mystery(BankAccountTester that,double amount) {
        this.balance -= amount;
        that.balance += amount; 
        System.out.println("Q5 this balance = " + this.balance + " that balance = " + that.balance);
    
    
    } 
   
    
    
    
    
}

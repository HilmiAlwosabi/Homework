package HW5;

public class MainOfBank {
    public static void main(String[] args) {
        BankAccountTester Q3= new BankAccountTester();
        
        // Q 4 ----------------------------------
        BankAccountTester Q4 =new BankAccountTester(500);
        System.out.println("Q4 balance = :"+Q4.addinterest(10));
        
        // Q 5 ----------------------------------
        BankAccountTester Q5= new BankAccountTester();
        Q5.mystery(Q4, 40);
        
        // Q 8 ----------------------------------
        BankAccountTester Q8 = new BankAccountTester(1000);
        Q8.addinterest(10);
        Q8.addinterest(10);
        System.out.println(Q8.addinterest(10));
        System.out.println(Q8.addinterest(10));
    
        // Q 8 ----------------------------------
        
    }
}

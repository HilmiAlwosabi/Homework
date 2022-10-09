package HW5;

public class Q1 {
    public static void main(String[] args) {
        tallyCounter Q_1 = new tallyCounter();
        
        Q_1.setNumber();
        System.out.println(Q_1.getNumber());
        Q_1.setNumber();
        System.out.println(Q_1.getNumber());
        Q_1.setNumber();
        System.out.println(Q_1.getNumber());
        
        Q_1.undo();
        System.out.println(Q_1.getNumber());
        Q_1.undo();
        System.out.println(Q_1.getNumber());
        Q_1.undo();
        System.out.println(Q_1.getNumber());
    }
}

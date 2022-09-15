import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String x=in.nextLine();
        System.out.println(" x = "+x);
            x=x.replace("i","!");
            x=x.replace("s","$");
            System.out.println(" +x = "+x);

    }
}

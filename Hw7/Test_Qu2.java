import java.util.Scanner;

public class Test_Qu2 {
    public static void main(String[] args) {
        Question[] ques= new Question[2];
        Qu2 question0 =new Qu2("_James Gosling_ was the inventor of Java. ");
        ques[0]=question0;
        question0.display();
        System.out.println("your answer: ");
        Scanner in=new Scanner(System.in);
        String response= in.nextLine();
        System.out.println(question0.checkAnswer(response));
    }
}

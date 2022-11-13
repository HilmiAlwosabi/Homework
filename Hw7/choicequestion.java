import java.util.ArrayList;

public class choicequestion extends THEFirst {
   


        private ArrayList<String> choices;

        public choicequestion(String text, String answer, ArrayList<String> choices) {
            super(text, answer);
            this.choices = choices;
        }
        public  void addchoice(String ch,boolean correct)
        {
            choices.add(ch);
            if(correct)
                setAnswer(choices.size()+" ");

        }
        public void display()
        {
            super.diplay();
            for (int i = 0; i < choices.size(); i++)
            {
                System.out.println((i+1+" "+choices.get(i)));
            }
        }



}

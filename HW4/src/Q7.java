
import javax.swing.JFrame;
import java.awt.*;
public class Q7 extends JFrame{
    public Q7(){
    setTitle("Q7");
    setSize(500, 500);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
}
    public void paint (Graphics h){
        h.setColor(Color.PINK);
        h.fillRect(150, 150, 150, 80);
        h.setColor(Color.MAGENTA);
        h.fillRect(300, 230, 150, 80);
    }
    public static void main(String[] args) {
        Q7 ob = new Q7();

        ob.paint(null);
    }
}

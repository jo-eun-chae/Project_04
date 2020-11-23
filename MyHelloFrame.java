import javax.swing.*;
import java.awt.*;

/**
 * Write a description of class MyHelloFrame here.
 *
 * @author (2019315026 전유정)
 * @version (2020.11.23)
 */
public class MyHelloFrame extends JFrame
{
    public MyHelloFrame(){
        this.setTitle("실습#4(2020.11.23)");
        this.setSize(500,500);
        
        MyHelloPanel mp = new MyHelloPanel();
        this.app(mp);
        
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

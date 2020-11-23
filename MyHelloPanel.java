import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Write a description of class MyHelloPanel here.
 *
 * @author (2019315026 전유정)
 * @version (2020.11.23)
 */
public class MyHelloPanel extends JPanel
{
    public MyHelloPanel()
    {
        JLabel ml = new JLabel();
        ml.setText("HELLO");
        ml.setSize(50,50);
        this.setLayout(null);
        ml.setLocation(50,100);
        
        this.add(ml);
    }
}

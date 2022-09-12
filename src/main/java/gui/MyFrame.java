package gui;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    public MyFrame() {
        super("DREAM BOAT FINDER");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int xWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
        int yHeight = Toolkit.getDefaultToolkit().getScreenSize().height;
        setSize(xWidth/2,yHeight/2);

        int frameWidth = this.getSize().width;
        int frameHeight = this.getSize().height;

        this.setLocation((xWidth - frameWidth)/2, (yHeight - frameHeight)/2);

        setLayout(new FlowLayout());


        add(new JButton("button 1 "));
        add(new JButton("button 2 "));
        add(new JButton("button 3 "));
        add(new JButton("button 4 "));




        setVisible(true);
    }
}

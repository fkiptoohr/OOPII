package gui;

import javax.swing.*;
import java.awt.*;

/**
 * Author: flex
 * Date: 02/10/2023
 */
public class Swing {
    JFrame jFrame;
    Panel p;
    public Swing(){
        jFrame = new JFrame();
//        jFrame.setTitle("Gui Programming");
//        jFrame.setSize(300, 200);
//        jFrame.setVisible(true);
        Container c = jFrame.getContentPane();
        c.setLayout(new BorderLayout());
        p = new Panel();
        c.add(p, BorderLayout.SOUTH);
        jFrame.setSize(400, 400);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    public static void main(String args[]){
        Swing t = new Swing();
    }
}

package com.example.swing;

import javax.swing.*;
import java.awt.*;

public class JLayeredPaneExample extends JFrame {
    public static void main(String[] args) {

        JLayeredPaneExample frame = new JLayeredPaneExample();

        JLayeredPane layeredPane = frame.getLayeredPane();

        JButton b1 = new JButton("Button 1");
        b1.setBounds(10, 10, 50, 50);
        b1.setBackground(Color.BLUE);
        layeredPane.add(b1, 5);

        JButton b2 = new JButton("Button 2");
        b2.setBounds(15, 30, 150, 50);
        b2.setBackground(Color.YELLOW);
        layeredPane.add(b2, 2);

        JButton b3 = new JButton("Button 3");
        b3.setBounds(50, 50, 50, 50);
        b3.setBackground(Color.GREEN);
        layeredPane.add(b3, 7);


        frame.setLayout(null);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

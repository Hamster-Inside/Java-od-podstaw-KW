package com.example.swing;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class JPanelExample extends JFrame {
    public static void main(String[] args) {

        JPanelExample frame = new JPanelExample();

        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.add(new JButton("Button 1"));
        panel.add(new JLabel("Label 1"));
        panel.setPreferredSize(new Dimension(150,150));
        frame.add(panel);

        frame.setLayout(new FlowLayout());
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

package com.example.swing;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class JColorChooserExample extends JFrame {
    public static void main(String[] args) {

        JColorChooserExample frame = new JColorChooserExample();

        Color color = JColorChooser.showDialog(frame,"KOLORY",Color.BLUE);

        System.out.println("Wybrano kolor: " + color);
        JLabel label = new JLabel("Label");
        frame.add(label);
        label.setForeground(color);

        frame.setLayout(new FlowLayout());
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

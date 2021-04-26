package com.example.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JRadioButtonExample extends JFrame {
    public static void main(String[] args) {

        JRadioButtonExample frame = new JRadioButtonExample();
        JRadioButton button1 = new JRadioButton("CAR");
        JRadioButton button2 = new JRadioButton("PLANE");
        JRadioButton button3 = new JRadioButton("TRAIN");
        ButtonGroup group = new ButtonGroup();
        group.add(button1);
        group.add(button2);
        group.add(button3);
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JRadioButton b = (JRadioButton) e.getSource();
                System.out.println("Clicked: " + b.getText());
            }
        };
        button1.addActionListener(listener);
        button2.addActionListener(listener);
        button3.addActionListener(listener);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.setLayout(new FlowLayout());
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

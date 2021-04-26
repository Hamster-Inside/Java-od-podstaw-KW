package com.example.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JToggleButtonExample extends JFrame {
    public static void main(String[] args) {

        JToggleButtonExample frame = new JToggleButtonExample();

        JToggleButton toggleButton1 = new JToggleButton("BUTTON 1");
        JToggleButton toggleButton2 = new JToggleButton("BUTTON 2");
        toggleButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("BUTTON 1 SELECTED " + toggleButton1.isSelected());
                toggleButton2.setSelected(false);
            }
        });
        toggleButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("BUTTON 2 SELECTED " + toggleButton2.isSelected());
                toggleButton1.setSelected(false);
            }
        });
        frame.add(toggleButton1);
        frame.add(toggleButton2);
        frame.setLayout(new FlowLayout());
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

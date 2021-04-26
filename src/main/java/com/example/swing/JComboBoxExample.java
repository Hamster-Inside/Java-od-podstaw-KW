package com.example.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JComboBoxExample extends JFrame {
    public static void main(String[] args) {

        JComboBoxExample frame = new JComboBoxExample();
        String prog[] = {"Java", "C++", "Python", "PHP"};
      JComboBox<String> box1 = new JComboBox<>(prog);
      box1.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
              System.out.println("Selected: " + box1.getSelectedIndex());
          }
      });
        box1.addActionListener(box1);
        box1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                int state = e.getStateChange();
                if (state == ItemEvent.SELECTED){
                    System.out.println("Selected: ---> " + e.getItem());
                }
                else if (state == ItemEvent.DESELECTED){
                    System.out.println("Deselected: ---> " + e.getItem());
                }
            }
        });
        frame.add(box1);
        frame.setLayout(new FlowLayout());
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

package com.example.swing;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JPasswordFieldExample extends JFrame {
    public static void main(String[] args) {

        JPasswordFieldExample frame = new JPasswordFieldExample();
        JPasswordField jp = new JPasswordField(10);
jp.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Password: " + new String(jp.getPassword()));
    }
});


        frame.add(jp);
        frame.setLayout(new FlowLayout());
        frame.setSize(300, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

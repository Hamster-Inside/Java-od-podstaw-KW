package com.example.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ScrollPaneLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        JLabel label = new JLabel(new ImageIcon("files\\city.jpg"));
        JScrollPane scrollPane = new JScrollPane(label);
        frame.add(scrollPane);

        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

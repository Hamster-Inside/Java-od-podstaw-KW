package com.example.swing;

import javax.swing.*;
import java.awt.*;

public class JFrameExample extends JFrame {
    public static void main(String[] args) {


        JFrameExample frame = new JFrameExample();
        frame.add(new JButton("Button 1"));
        frame.add(new JLabel("label 1"));
        frame.setLayout(new FlowLayout());
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
package com.example.swing;

import javax.swing.*;
import java.awt.*;

public class BoxLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setLayout(new BoxLayout(frame.getContentPane(),BoxLayout.Y_AXIS));
        for (int i = 0; i<9; i++){
            frame.add(new JButton("Button" + (i+1)));
        }

        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

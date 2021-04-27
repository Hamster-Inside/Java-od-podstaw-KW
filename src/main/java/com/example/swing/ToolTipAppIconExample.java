package com.example.swing;

import javax.swing.*;
import java.awt.*;

public class ToolTipAppIconExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton b1 = new JButton("Button1");
        b1.setToolTipText("Kliknij tu");

        Image icon = new ImageIcon("files\\city.jpg").getImage();
        frame.setIconImage(icon);

        frame.setLayout(new FlowLayout());
        frame.add(b1);

        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

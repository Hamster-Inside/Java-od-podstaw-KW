package com.example.swing;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class BorderLayoutManagerExample {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setLayout(new BorderLayout()); // domyślnie

        Border border = BorderFactory.createLineBorder(Color.BLACK);
        JLabel north = new JLabel("North",JLabel.CENTER);
        north.setBorder(border);
        frame.add(north,BorderLayout.NORTH);

        JLabel west = new JLabel("West",JLabel.CENTER);
        west.setBorder(border);
        frame.add(west,BorderLayout.WEST);

        JLabel east = new JLabel("East",JLabel.CENTER);
        east.setBorder(border);
        frame.add(east,BorderLayout.EAST);

        JLabel south = new JLabel("South",JLabel.CENTER);
        south.setBorder(border);
        frame.add(south,BorderLayout.SOUTH);

        JLabel center = new JLabel("Center",JLabel.CENTER);
        center.setBorder(border);
        frame.add(center,BorderLayout.CENTER);


        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

package com.example.swing;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class JLabelExample extends JFrame {
    public static void main(String[] args) {

        JLabelExample frame = new JLabelExample();
      JLabel label1 = new JLabel("LABEL 1");
      label1.setText("<html><u>NOWY LABEL1</u></html>");

      label1.setBounds(50,50,50,50);
      label1.setForeground(Color.BLUE);
      label1.setOpaque(true);
      label1.setBackground(Color.WHITE);
      label1.setHorizontalAlignment(JLabel.CENTER);
      Border border = BorderFactory.createLineBorder(Color.RED, 2);
      label1.setBorder(border);

      frame.add(label1);
        frame.setLayout(null);
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

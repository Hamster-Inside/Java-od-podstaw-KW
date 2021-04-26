package com.example.swing;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JDialogExample extends JFrame {
    public static void main(String[] args) {

        JDialogExample frame = new JDialogExample();

        JDialog dialog = new JDialog(frame, "DIALOG FRAME", true);
        dialog.setLayout(new FlowLayout());
        JButton button1 = new JButton("Button 1");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.setVisible(false);
            }
        });
        dialog.add(button1);
        dialog.setSize(300, 300);
        frame.setVisible(true);
        dialog.setVisible(true);
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

    }
}

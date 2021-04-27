package com.example.swing;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import java.awt.*;

public class JTextPaneExample extends JFrame {
    public static void main(String[] args) throws Exception{
        JTextPaneExample frame = new JTextPaneExample();

        JTextPane textPane = new JTextPane();
        JScrollPane scrollPane = new JScrollPane(textPane);
        textPane.setText("Lorem ipsum");
        SimpleAttributeSet attributeSet = new SimpleAttributeSet();
        StyleConstants.setBold(attributeSet,true);
        StyleConstants.setItalic(attributeSet,true);
        StyleConstants.setForeground(attributeSet,Color.BLUE);
        StyleConstants.setBackground(attributeSet,Color.GREEN);
        textPane.getDocument().insertString(0,"Hello World! ",attributeSet);
        textPane.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                System.out.println("Insert Update" + textPane.getText());
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                System.out.println("Remove Update");
            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });

        frame.add(scrollPane, BorderLayout.CENTER);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

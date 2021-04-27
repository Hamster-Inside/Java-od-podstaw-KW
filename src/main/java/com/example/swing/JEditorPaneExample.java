package com.example.swing;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;

public class JEditorPaneExample extends JFrame {
    public static void main(String[] args) {
        JEditorPaneExample frame = new JEditorPaneExample();

        JEditorPane editor = new JEditorPane(
                "text/html",
               "<html><h5>Title</h5><p>Lorem ipsum</p><p>Lorem impsum</p></html>"
        );
        editor.setEditable(true);
        editor.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                System.out.println("Insert update" + editor.getText());
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                System.out.println("Remove update");
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                System.out.println("Change update");
            }
        });
        JScrollPane scrollPane = new JScrollPane(editor);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
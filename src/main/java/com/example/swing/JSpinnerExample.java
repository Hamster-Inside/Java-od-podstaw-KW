package com.example.swing;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JSpinnerExample extends JFrame {
    public static void main(String[] args) {

        JSpinnerExample frame = new JSpinnerExample();

       SpinnerNumberModel spinnerModel = new SpinnerNumberModel(10,-5,15,1);
        JSpinner  jSpinner = new JSpinner(spinnerModel);
        jSpinner.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                System.out.println("Spinner: " + jSpinner.getValue());
            }
        });
        frame.add(jSpinner);

        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

package com.example.swing;

import javax.swing.*;

public class JOptionPaneShowConfirmDialog {
    public static void main(String[] args) {
        int result = JOptionPane.showConfirmDialog(
                null,
                "Czy zapisać dane?",
                "Dane zmodyfikowane",
                JOptionPane.YES_NO_CANCEL_OPTION
        );
        switch (result){
            case JOptionPane.YES_OPTION:
                System.out.println("YES");
                break;
            case JOptionPane.NO_OPTION:
                System.out.println("NO");
                break;
            case JOptionPane.CANCEL_OPTION:
                System.out.println("CANCEL");
                break;
        }
    }
}

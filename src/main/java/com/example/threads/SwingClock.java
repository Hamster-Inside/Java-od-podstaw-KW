package com.example.threads;

import javax.swing.*;
import java.time.LocalDateTime;

public class SwingClock extends JFrame implements Runnable {
    private Thread thread;
    String hour,minutes,seconds;
    JLabel label;

    @Override
    public void run() {
        try{
            while(true){
                LocalDateTime today = LocalDateTime.now();
                hour = "" + today.getHour();
                minutes = String.format("%02d",today.getMinute());
                seconds = String.format("%02d",today.getSecond());
                label.setText(hour + ":" + minutes + ":" + seconds);
                thread.sleep(1000);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public SwingClock(){
        label = new JLabel("", JLabel.CENTER);
        label.setBounds(5,5,100,40);
        add(label);
        setSize(100,80);
        setLayout(null);
        setVisible(true);
        thread = new Thread(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        thread.start();
    }
    public static void main(String[] args) {
         SwingClock clock = new SwingClock();
    }
}
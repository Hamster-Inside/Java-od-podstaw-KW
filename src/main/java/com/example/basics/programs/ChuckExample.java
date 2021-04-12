package com.example.basics.programs;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class ChuckExample {
    public static void main(String[] args) {

        try {
            URL url = new URL("https://api.chucknorris.io/jokes/random");
            InputStream is = url.openStream();
            BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(is)
            );
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains("value")) {
                    String line2 = line.substring(line.indexOf("value")+8);
                    line2 = line2.substring(0,line2.length()-2);
                    System.out.println("\n" + line2);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}

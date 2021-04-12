package com.example.basics.date;

import java.util.Date;

public class PrintfExample {
    public static void main(String[] args) {
        Date date = new Date();
        //System.out.printf("Hello %s %d %f %b %n %tc %n", "World", 12, 5.6f, true, date);
        //System.out.printf("%n%n Hello %2$tY.%2$2tm.%2$td %s", "World", date);
        String str = String.format("%n%n Hello %2$tY.%2$2tm.%2$td %s %n", "World", date);
        System.out.println(str);
        str = String.format("%n%n %1$tH-%1$tM-%1$tS", date);
        System.out.println(str);
    }
}

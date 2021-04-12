package com.example.basics.date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-mm-dd HH:mm:ss");
        String str = dateTimeFormatter.format(localDateTime);
        System.out.println(str);
        System.out.println(localDateTime.getYear());
        System.out.println(localDateTime.getMonth());
        System.out.println(localDateTime.getDayOfMonth());
        localDateTime = localDateTime.plusYears(200);
        localDateTime = localDateTime.plusMonths(200);
        str = dateTimeFormatter.format(localDateTime);
        System.out.println(str);
    }
}

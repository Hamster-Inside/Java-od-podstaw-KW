package com.example.basics.date;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class CompareDates {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2022,12,10);
        LocalDate date2 = LocalDate.of(2020,10,5);
        System.out.println(date1.isAfter(date2));
        System.out.println(date1.isBefore(date2));
        System.out.println(date1.equals(date2));

        LocalDateTime localDateTime1 = LocalDateTime.now();
        LocalDateTime localDateTime2 = LocalDateTime.of(2022,10,10,11,11,11);
        System.out.println(localDateTime1.isAfter(localDateTime2));
    }
}

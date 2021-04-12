package com.example.basics.date;

import java.time.LocalDate;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println(localDate.getYear() + "." + localDate.getMonthValue() + "." + localDate.getDayOfMonth());
        localDate = localDate.plusMonths(10);
        localDate = localDate.minusMonths(5);
        localDate = localDate.plusDays(11);
        System.out.println(localDate.getYear() + "." + localDate.getMonthValue() + "." + localDate.getDayOfMonth());

    }
}

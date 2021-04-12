package com.example.basics.date;

import java.util.Calendar;
import java.util.Date;

public class DateInFutureAndPast {
    public static void main(String[] args) {
        Date dateNow = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateNow);
        calendar.add(Calendar.MONTH, 1);
        calendar.add(Calendar.DAY_OF_MONTH, 2);
        calendar.add(Calendar.YEAR, 1);
        calendar.add(Calendar.MINUTE, 30);
        calendar.add(Calendar.SECOND, 33);
        calendar.add(Calendar.HOUR, 10);
        Date dateInFuture = calendar.getTime();
        System.out.println(dateInFuture);
        calendar.add(Calendar.YEAR, -30);
        Date dateInPast = calendar.getTime();
        System.out.println(dateInPast);
    }
}

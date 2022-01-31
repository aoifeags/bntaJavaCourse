package com.bnta.exercises.week_two_wed;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class WorkingWithDates {
    public static void main(String[] args) {
        // there are three classes

        //iniutialise an onject to work with dates

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);  //this is current date of my machine

        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getDayOfWeek());
        System.out.println(localDateTime.getDayOfYear());

        LocalDate d = LocalDate.of(2000,1, 1);
        System.out.println(d.getMonth());

        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalTime time = LocalTime.now();
        System.out.println(time);

    }
}

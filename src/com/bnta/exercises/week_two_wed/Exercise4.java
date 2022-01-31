package com.bnta.exercises.week_two_wed;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Exercise4 {

    public static void main(String[] args) {
        // 1 - Print todays Date and Time using LocalDate
        // 2 - Represent your date of birth using LocalDate
        // 3 - Add 100 days to your dob and print it


        LocalDateTime localdt = LocalDateTime.now();
        LocalDate mybday = LocalDate.of(1995, 1, 31);
                                           // what to do here - try convert this to a primitive data type and add 100 then?
                                            // i looked about doing it with int, but int will not be long enough
                                            // nvmd - there's a mathod called plusDays for it

        System.out.println(mybday.plusDays(100));

    }

}

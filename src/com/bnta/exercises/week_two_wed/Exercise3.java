package com.bnta.exercises.week_two_wed;

public class Exercise3 {

    public static void main(String[] args) {
            // invoke .values() method on Tshirt enum and loop through its values
            // and while looping lowercase each value
            // hint: while you loop through enums invoke .name() to convert enum to string. without it, you can't lowercase



        for (Exercise1.TshirtSize size : Exercise1.TshirtSize.values()) {
            System.out.println(size.name().toLowerCase());    // could also use .toString instead of .name but less good from a constancy perspective.

        }

        }

}

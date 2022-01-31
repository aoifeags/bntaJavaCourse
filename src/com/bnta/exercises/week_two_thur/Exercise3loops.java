package com.bnta.exercises.week_two_thur;

public class Exercise3loops {

    // QUESTION 3

    public static void main(String[] args) {
        // create a for loop which goes from 0 to 20
        // print each even value

        for (int i = 0; i <= 20 ; i+=2) {
            System.out.println(i);

        }
        System.out.println("An alternative method:");

        // alternatively
        for (int i = 0; i <= 20 ; i++) {
            if (i%2 == 0) {
                System.out.println(i);
            }

        }

    }

}

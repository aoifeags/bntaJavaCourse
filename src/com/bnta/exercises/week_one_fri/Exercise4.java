package com.bnta.exercises.week_one_fri;

public class Exercise4 {
    public static void main(String[] args) {
        String input = "0.90, 1.00, 9.00, 8.78, 0.01";
        float result =  0;
        String[] splitStringArray = input.split(",");



       for (int i = 0; i < splitStringArray.length; i++) {
//           System.out.println(splitStringArray[i]);
           float dub=Float.parseFloat(splitStringArray[i]);
           result = result + dub;



        }

        System.out.println("My final result is " + result);


        /*
           Write a program that adds total amount for this string "0.90, 1.00, 9.00, 8.78, 0.01".

           Tip:
            - String input = "0.90, 1.00, 9.00, 8.78, 0.01";
            - create variable to store result. double result = 0;
            - convert string to array.
            - then loop.
            - convert each string to decimal and add to current result
        */

       /* Logical
       1. make a string of all
       2. split into an array using , to separate



        */



    }
}


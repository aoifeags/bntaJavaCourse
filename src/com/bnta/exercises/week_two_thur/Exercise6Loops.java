package com.bnta.exercises.week_two_thur;

import java.util.Arrays;

public class Exercise6Loops {

// QUESTION 6

        public static void main(String[] args) {
            // create a sum variable
            // using your answer from Question 4, create a for loop that goes through the values
            // add each item to the sum value
            // print the total sum

            int sumof = 0;

            int[] myArray = new int[11];    //make a new Array, with length 11, where my array will be stored

            for (int i = 0; i <= 10 ; i++) {     //for loop will fill my array with numbers 0 -10
                myArray[i] = i;
                System.out.println(i);
                sumof = myArray[i] + sumof;

            }
            System.out.println("The sum of the numbers from 0 - 10 is: " + sumof);
        }

}

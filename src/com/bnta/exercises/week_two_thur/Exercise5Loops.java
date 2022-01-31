package com.bnta.exercises.week_two_thur;

import java.util.Arrays;

public class Exercise5Loops {

    // QUESTION 5

    // using your answer from Question 4, create a for loop that goes through the values
    // use a second for loop which prints each item in your array to the terminal individually. NB (one iteration of the loop at a time (so the numbers will be on separate lines))
    // print each value individually

    public static void main(String[] args) {
        int[] myArray = new int[11];    //make a new Array, with length 11, where my array will be stored

        for (int i = 0; i <= 10 ; i++) {     //for loop will fill my array with numbers 0 -10
            myArray[i] = i;
                                            //  System.out.println(i);    I could just do this and get the same result...but I've been asked to use a for loop...
        }
        for(int iter : myArray)  {
            System.out.println(iter);
        }

    }

}

package com.bnta.exercises.week_two_thur;
import java. util. Arrays;

public class Exercise4loops {
    // QUESTION 4

    public static void main(String[] args) {
        int[] myArray = new int[11];    //make a new Array, with length 11, where my array will be stored

        for (int i = 0; i <= 10 ; i++) {     //for loop will fill my array with numbers 0 -10
            myArray[i] = i;

        }

        String output = Arrays.toString(myArray);        // this should be my output string, with the numbers converted to strings
                                                        // (need to import Arrays otherwise have to do it the long way)
        System.out.println(output);                      //this will print the output string


        // create an array. Remember to manually set the size
        // create a for loop which goes from 0 to 10, adding each value to an array
        // print our array
    }

}

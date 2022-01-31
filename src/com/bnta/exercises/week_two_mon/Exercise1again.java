package com.bnta.exercises.week_two_mon;

public class Exercise1again {

    // this is where you call it
    public static void main(String[] args) {
        String output = myFunction("TODO");
        System.out.println(output);

        System.out.println(myFunction("Amina"));

    }


    // this is the method
    static String myFunction(String input) {
        String output = "";
        for (int i=input.length() -1; i>= 0; i--) {
            output += input.charAt(i);

        }


        return output;

    }


}

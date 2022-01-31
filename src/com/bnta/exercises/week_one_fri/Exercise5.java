package com.bnta.exercises.week_one_fri;

public class Exercise5 {

        public static void main(String[] args) {    //args here is an input - you don't put the input in the brackets, you enter it at runtime in the command line
            // loop through args here
            String[] phrase = args;

            for (int i=0;i  < phrase.length; i++) {
                short shortie = Short.parseShort(phrase[i]);   //why is it a short? because it's a relatively big number - i could have used double, long, etc but i doubt i'll need a number over 32000
                System.out.println(args[i]);

            }
}
        /*
           Write a program that takes arguments from the program args and loops through args and prints each item in
           args
           Compile using: javac and run using: java
           i.e. javac com.bnta.exercises.week_one_fri.Exercise5.java | java com.bnta.exercises.week_one_fri.Exercise5 foo bar baz
         */



}

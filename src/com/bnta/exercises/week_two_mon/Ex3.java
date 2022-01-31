package com.bnta.exercises.week_two_mon;

public class Ex3 {

    /*
      Write a program that receives numbers as program arguments and prints to console if numbers are even or odd
      You might compile and run the program via command line or by editing configuration and pass program arguments



    //before I start - this doesn't explicitly say it needs to be a method, but I will make it as one because I want my code to be re-usable
    - also it's good practice for getting a method to take program arguments

    steps in plain english:
    1) define numEvenOdd with integers as input type (because with ints we can do modulus op)
    2) make a variable for the program argument if required? (eventually i did not do this)
    3) do modulo op and see if divisible by 2 w/no remainder
    4) if / else statement at this stage - if modulo is 0, then even
    if it is !0 then the odd pathway
    5) make print statements
    6) test in main body
*/

    static void numEvenOdd(int input) {
        // It took me FOREVER to figure out that I needed to have void when I wasn't returning anything (I had string
        // in there originally because I had it in my head that I'd print a string to the console at the end.)

        if (input % 2 == 0) {
            System.out.println("Number is Even");

        } else {
            System.out.println("Number is Odd");

        }

    }

    public static void main(String[] args) {
        numEvenOdd(27);
        numEvenOdd(18040);
        numEvenOdd(-3402);
    }
}

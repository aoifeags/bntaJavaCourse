package com.bnta.exercises.week_two_mon;

public class Ex4 {
    /*
      Write a program that takes an input number from the console and prints if number is prime
      Create a method to check if number is prime then use against the input
      1) think what is prime? - divisible by itself and 1. So 13 % 2 = 13.
      so the 'true' case of prime will be num % 2 == num.
    */
    // write something that divides a number by every number smaller than it and checks if the remainder == 0
    //

    static void isPrime(int numb) {
        //handling this exception
        if (numb <= 1) {
            System.out.println(numb + " is not Prime");
            return;
        }

        for (int i = 2; i < numb/2; i++) {
            int remainder = numb % i;
            if (remainder == 0) {
                System.out.println(numb + " is not Prime");
                return;
            }
        }

        System.out.println(numb + " is Prime");
    }


    public static void main (String[]args){
        isPrime(29);
        isPrime(18040);
        isPrime(-3402);
    }

}


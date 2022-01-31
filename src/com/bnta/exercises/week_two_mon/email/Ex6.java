package com.bnta.exercises.week_two_mon.email;

import java.util.Scanner;

public class Ex6 {
    /*
        Create a package called email    // qu for Nelson - what to do for the package/??
        Then have a method called validateEmail that return true of false if input is valid email
        Finally invoke validateEmail in main
            i.e. "hello@gmail.com" -> true
            i.e. "hellogmail.com" -> false
    */
    public static String validEmail() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your email address");
        String email = scanner.nextLine();

        boolean atSymb = email.contains("@");
        boolean dotEnding = email.endsWith(".com") || email.endsWith(".co.uk") || email.endsWith(".net");

        if (atSymb && dotEnding) {
            System.out.println("Is the following email address valid? " + email);
            return "True";
                                    // I realise returning Strings of true and false is maybe not the intention -
                                     // but i had enough booleans going on and I didn't want to make the method return a Bool as String felt more flexible
        } else {
            System.out.println("Is the following email address valid? " + email);
            return "False";
        }

    }

    public static void main(String[] args) {
        System.out.println(validEmail());

    }
}


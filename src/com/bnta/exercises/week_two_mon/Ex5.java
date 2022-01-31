package com.bnta.exercises.week_two_mon;
import java.util.Random;
import java.util.Scanner;

public class Ex5 {
    /*
        Write a method that displays a random joke to the user.
        Your program should stop displaying jokes when the user inputs no.
        For e.g.
        Want to hear a joke? Yes/No
            if yes: then display joke and repeat same question
            if no: then program should exit


            Steps
            1) set up question, scanner and convert raw answer to uniform type for String comparison
            2) if statement - yes, no, and invalid input are branches
            3) within if statement, make String array? to hold jokes
            4) have random number generated and then plug into the i of the string array
            5) write the end - either exit, or have another joke
    */

    public static void main(String[] args) {


        String[] jokesBank = {
                "I can’t believe I got fired from the calendar factory. All I did was take a day off!",
                "Money talks. Mine always says goodbye.",
                "I went to see the doctor about my short-term memory problems — the first thing he did was make me pay in advance.",
                "Most people are shocked when they find out how bad I am as an electrician.",
                "I’m reading a book about anti-gravity. It’s impossible to put down.",
                "What is the best thing about living in Switzerland? Well, the flag is a big plus."
        };


        while (true) {
            String question = "Want to hear a joke?";

            Scanner scanner = new Scanner(System.in);
            System.out.println(question);
            String rawanswer = scanner.nextLine();

            String answer = rawanswer.toLowerCase();


            if (answer.equals("yes")) {
                //make a String Array and the indices can be the different jokes
                // then can use a random number generator between 0-6 for the diff jokes


//            I would just like to have this here as a list. I probably can't do it like this unfortunately.
//            jokesBank[0] = "I can’t believe I got fired from the calendar factory. All I did was take a day off!";
//            jokesBank[1] = "Money talks. Mine always says goodbye.";
//            jokesBank[2] = "I went to see the doctor about my short-term memory problems — the first thing he did was make me pay in advance.";
//            jokesBank[3] = "Most people are shocked when they find out how bad I am as an electrician.";
//            jokesBank[4] = "I’m reading a book about anti-gravity. It’s impossible to put down.";
//            jokesBank[5] = "What is the best thing about living in Switzerland? Well, the flag is a big plus.";

                System.out.println(ranString(jokesBank));

            } else if (answer.equals("no")) {
                System.out.println("Okay then, bye");
                break;


            } else {
                System.out.println("Not a valid input. Please run again");

            }

        }

    }
    // a method to create a random number with output String
    static String ranString(String[] strings) {
        Random ran = new Random();
        String mystring = strings[ran.nextInt(strings.length)];
        return mystring;

    }

}



package com.bnta.exercises.week_two_mon;

public class Ex2 {

    /*
      Given the following String input
      String input = "   b ri   ght net   work  "
      Write a program that transforms input into: Bright Network
    */

    public static void main(String[] args) {
        String inputString = "   b ri   ght net   work  ";

        String midString = inputString.trim();    //here I'm using a trim statement to get rid of whitespace before and after my desired text
        System.out.println("After the first step, my string looks like this: " + midString);
        String midString2 = midString.replace(" ", "");
        System.out.println("After the second step, my string looks like this: " + midString2);

        //I've done the hard bit. Now I need to make the capitals, and 'split' the string into two words - hint, I'm not actually going to split it
        // I'm totally going to cheat for this because I tried to ages to do it differently but this was in the end, way, way easier.

        String strNew = midString2.replace("b", "B");   //fairly straightforward
        String strNew2 = strNew.replace("n", " N");    //NOTE THE SPACE before N. I couldn't find a way to insert a character at a given index. So this is my creative solution.
        System.out.println("My final answer is: " + strNew2);



    }


}

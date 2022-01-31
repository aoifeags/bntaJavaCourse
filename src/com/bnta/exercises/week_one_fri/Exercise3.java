package com.bnta.exercises.week_one_fri;

public class Exercise3 {
    public static void main(String[] args) {
        /*
            Write a program that reverses an array of Strings
            String[] content = {"you", "are", "how", "hello"}
            Tip. Use for loop and you to start at highest index.
            Output should be: hello how are you?. Note question mark at the end
        */

        // Making my array

        String[] sentence = {"you?", "are", "how", "hello"};

        // make a for loop that starts at sentence length -1 - which will be i=3 - (this must be an integer) - and decrements by 1, however it must end at 0
        // so START (sentence.length - 1) STOP (when i >= 0 ) STEP (i--)    - similar to python

        for (int i = sentence.length - 1; i >= 0; i--) {
            System.out.print(sentence[i] + "  ");
        }















//        System.out.println("dis the new shit");
//
//
//        {
//            Integer[] intArray = {10,20,30,40,50,60,70,80,90};
//
//            //print array starting from first element
//            System.out.println("Original Array:");
//            for(int i=0;i<intArray.length;i++)
//                System.out.print(intArray[i] + "  ");
//
//            System.out.println();
//
//            //print array starting from last element
//            System.out.println("Original Array printed in reverse order:");
//            for(int i=intArray.length-1;i>=0;i--)
//                System.out.print(intArray[i] + "  ");



    }
}

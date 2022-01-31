package com.bnta.exercises.week_one_fri;

public class Exercise2 {
    public static void main(String[] args) {
        String stringA = "Alpha";
        String stringB= "Beta";


        boolean sameStringLocation = stringA == stringB;
        boolean sameStringValue = stringA.equals(stringB);


        System.out.println("The two strings compared have the same reference in the memory: " + sameStringLocation);
        System.out.println("The two strings compared have the same value (look the same): " + sameStringValue);

//
//        String brand = "Amigoscode";
//        String youtubeChannelName = "Amigoscode";
//
//        System.out.println(brand == youtubeChannelName); // True
//        System.out.println(brand.equals(youtubeChannelName)); // True



    }
}



package com.bnta.exercises.week_two_tue; //you should change this to your own package name

public class tuesdaypractice {    //you should change this to your own class name
    public static void main(String[] args) {

//        System.out.println(capitalise("Michael"));
//        System.out.println(capitalise("Abdi"));
//        System.out.println(capitalise("Linda"));
//      these were strings from our earlier practice. You can see the next step in line 11, we have put them into a String Array, because that's what Nelson asked - to write a method to have an input String array, and an output String array.

        String[] strings = {"Michael", "linDa", "Abdi"};   //note that there is a range of capitalisation going on here in my input strings
        String[] result = capitaliseStrings(strings);
        for(String r : result) {     // using enhanced for loop because we only need to print the values when we run the method -
//                                      we don't need to know about the index anymore.
            System.out.println(r);
        }
    }

    static private String[] capitaliseStrings(String[] strings) {    //private because we don't need to use this in any other class (tabs at top of IntelliJ)

        String[] capitals = new String[strings.length];    // make a new empty string Array called capitals - this is going to be the output of the method capitaliseStrings, but we haven't done the capitalising bit yet.
        for (int i= 0; i < strings.length; i++) {           // this is the tricky bit. You can't directly apply the uppercase method onto your array with name strings.
                                                            // WHY?? -because you just can't uppercase an array. It's not a valid method for an array. It only works on strings. This is where the for loop comes in.
                                                            // The for loop allows you to do something (the same thing, in this case), to every element in an array. So you are actually applying uppercase to the individual elements of the STRINGS, at each of the indices of the array.
                                                            // So we write a for loop that has START i = 0 - the first index| STOP is strings.length - the last in the array| and STEP is incr by 1.

            capitals[i] = strings[i].toUpperCase();         // this line says, 'for the value at every index in the array strings, make it uppercase, and save it into the capitals string array, at the same position (i).

        }

        return capitals;                                     //  this return is the end of your function. You must have it, because you said so in the beginning (see static private String[] at 19 - that's the start of your method and String[] is the output you specified.)
                                                            // -// if you don't do this it won't work. You wouldn't require this however, if your output type was void.
    }
}

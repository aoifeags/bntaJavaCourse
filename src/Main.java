import java.awt.*;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

    int[] numbers = new int[3];
    numbers[0] = 1;
    numbers[1] = 44;
    numbers[2] = 77;


    //Once you define the size of an array, it is fixed - you can't change the size
//
//    System.out.println(numbers[0]);
//    System.out.println(numbers[2]);


     //   tO PRINT AN Array as a string
        //   System.out.println(nameofArray.toString(names))

System.out.println("now see");

    for (int i=0; i<= numbers.length - 1; i++) {

        System.out.println("At index :" + i);//loops through the index
        System.out.println(numbers[i]);  // loops through the values at the index locations


    }

    }

}

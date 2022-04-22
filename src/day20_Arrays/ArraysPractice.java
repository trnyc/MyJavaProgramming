package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40};
        System.out.println(Arrays.toString(numbers));

        System.out.println("==============================================");
        System.out.println();
    //create a variable that can contain 5 scores

        int[] scores = new int[5]; //[0, 0, 0, 0, 0]
                          // index    0  1  2  3  4
        scores[1] = 85;// [0, 85, 0, 0, 0]
        scores[scores.length-1] = 95;// [0, 85, 0, 0, 95]
        scores[3] = 75;// [0, 85, 0, 75, 95]
        scores[0] = 55;// [55, 85, 0, 75, 95]
        scores[2] = 65;// [55, 85, 65, 75, 95]

        System.out.println(Arrays.toString(scores));

        System.out.println("===================================================");
        System.out.println();

    //declare a variable that contains names of the months

    String[] months = {"January", "February", "March", "April", "June", "July",
            "August", "September", "October", "November", "December"};

    /*
        System.out.println( months[0] ); // Jan
        System.out.println( months[1] );// "Feb
        System.out.println( months[2] );
        System.out.println( months[3] );
        System.out.println( months[4] );
        System.out.println( months[5] );
        System.out.println( months[6] );
        System.out.println( months[7] );
        System.out.println( months[8] );
        System.out.println( months[9] );
        System.out.println( months[10] );
        System.out.println( months[11] );
*/

        for(int i = 0; i < months.length; i++){ //i: represents the index numbers of array starting from 0
            System.out.println( months[i] );
        }

        System.out.println("-----------------------------------------------");

        for(int i = months.length-1; i >= 0; i--  ){//i: represents the index numbers of array starting from last index
            System.out.println(months[i]);
        }


    }
}

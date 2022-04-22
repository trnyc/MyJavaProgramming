package day22_MultiDimensionalArray;

import java.util.Arrays;

public class IteratingMultiDimensionalArray2 {
    public static void main(String[] args) {

        int[][] arr2D = { {1,2,3} , {4,5,6,7}, {8,9,10,11,12}  };

 /*    Task1: print
        8 9 10 11 12
        4 5 6 7
        1 2 3      */


        for (int i = arr2D.length-1; i >=0 ; i--) {//i: index number of each array
            for (int j = 0; j < arr2D[i].length; j++) {//j: index number of each
                                                        // element of each array
            System.out.print(arr2D[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("-----------------------------------------------");
        System.out.println();

/*  Task2 :print
    3 2 1
    7 6 5 4
    12 11 10 9 8                */


        for (int i = 0; i < arr2D.length; i++) {
            for (int j = arr2D[i].length - 1; j >= 0; j--) {
                System.out.print(arr2D[i][j]+" ");
 /* outer loop [i] gets each single array inside the multi D array starting from
 index(0) and inner loop [j] gets every element in the single arrays starting from
 last index and reverse it.
  */

            }
            System.out.println();
        }

        System.out.println("_____________________________________________________");
        System.out.println();

 /*       Task 3: print
        12 11 10 9 8
        7 6 5 4
        3 2 1       */

        for (int i = arr2D.length - 1; i >= 0; i--) {
            for (int j = arr2D[i].length - 1; j >= 0; j--) {

                System.out.print(arr2D[i][j]+" ");

            }
            System.out.println();
        }


    }
}

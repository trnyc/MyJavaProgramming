package day22_MultiDimensionalArray;

import java.util.Arrays;

public class IteratingMultiDimensionalArray {

    public static void main(String[] args) {

        // index of the elements:    0 1 2     0 1 2 3    0 1 2  3   4
        int[][] arr2D = { {1,2,3} , {4,5,6,7}, {8,9,10,11,12}  };
        // index of arrays:       0         1            2

        for (int i = 0; i < arr2D.length; i++) {
          //  System.out.println(Arrays.toString(arr2D[i]));
        // this gets every ARRAY inside the multiD array

            for (int j = 0; j < arr2D[i].length; j++) {
            // this gets every ELEMENT of each array inside multiD array
                System.out.print(arr2D[i][j]+" ");

            }
            System.out.println();
            // to put every single array in different line
        }


        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");




    }
}

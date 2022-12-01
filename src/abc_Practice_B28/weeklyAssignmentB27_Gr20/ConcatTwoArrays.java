package abc_Practice_B28.weeklyAssignmentB27_Gr20;

import java.util.Arrays;

public class ConcatTwoArrays {

    /*
    1. Array -- Concat two arrays
Write a return method that can concate two arrays
*/

// Solution 1:

    public static int[] concatTwoArrays(int[] arr1 , int[] arr2) {

        int[] result = new int[arr1.length + arr2.length];

        int i = 0;

        for(int each: arr1) {
            result[i] = each;
            i++;
        }

        for(int each: arr2) {
            result[i] = each;
            i++;
        }

        return result;
    }


// Solution 2:

    public static int[] merge(int[] arr1,int[] arr2){

        int[] result = new int[arr1.length+ arr2.length];

        for (int i = 0; i < arr1.length; i++ ) {
            result[i] = arr1[i];

        }

        for (int i = 0; i < arr2.length; i++ ) {
            result[i + arr1.length] = arr2[i];

        }

        return result;
    }



// MAIN METHOD
    public static void main(String[] args) {

        int[] arr1={1,2,3,4};
        int[] arr2={5,6,7,8,9};

        int [] result = concatTwoArrays(arr1, arr2);
        //int [] result = merge(arr1, arr2);



        System.out.println(Arrays.toString(result));


    }



}

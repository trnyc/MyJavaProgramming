package day26_CustomMethodPractice;

import java.util.Arrays;

public class ReverseArray {


    //reverses the given array and returns a new one
    public static int[] reverse(int[] array){
        int[] result = new int[array.length];

        for (int i = array.length-1, j=0; i >=0 ; i--, j++) {
            result[j] = array[i];
/* here, starting from last index of variable 'array', all elements of it will be assigned to
'result'. So, i: is for indexes of 'array' and j: is for indexes of 'result'.
 */
        }
        return result;
    }


    //reverses the given array and returns a new one
    public static double[] reverse(double[] array){
        double[] result = new double[array.length];

        for (int i = array.length-1, j=0; i >=0 ; i--, j++) {
            result[j] = array[i];
        }
        return result;
    }



    //reverses the given array and returns a new one
    public static char[] reverse(char[] array){
        char[] result = new char[array.length];

        for (int i = array.length-1, j=0; i >=0 ; i--, j++) {
            result[j] = array[i];
        }
        return result;
    }



    //reverses the given array and returns a new one
    public static String[] reverse(String[] array){
        String[] result = new String[array.length];

        for (int i = array.length-1, j=0; i >=0 ; i--, j++) {
            result[j] = array[i];
        }
        return result;
    }
    
    
    
    
    

// ---------MAIN METHOD STARTS HERE--------------------------
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        int[] reverseArr = reverse(arr);

        System.out.println(Arrays.toString(reverseArr));


        String[] arr2 = {"aa", "bb", "cc", "dd"};

        String[] reversed = reverse(arr2);

        System.out.println(Arrays.toString(reversed));



    }




}

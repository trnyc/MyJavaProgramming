package day26_CustomMethodPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class MergeTwoArrays2 {


    //merge two given arrays and return a new one
    public static int[] merge(int[] array1, int[] array2){
        int[] result = {};

        for (int each : array1) {
            result = ArraysUtility.addElement(result, each);
        }
        for (int each : array2) {
            result = ArraysUtility.addElement(result, each);
        }
        return result;
    }


    //merge two given arrays and return a new one
    public static double[] merge(double[] array1, double[] array2){
        double[] result = {};

        for (double each : array1) {
            result = ArraysUtility.addElement(result, each);
        }
        for (double each : array2) {
            result = ArraysUtility.addElement(result, each);
        }
        return result;
    }


    //merge two given arrays and return a new one
    public static char[] merge(char[] array1, char[] array2){
        char[] result = {};

        for (char each : array1) {
            result = ArraysUtility.addElement(result, each);
        }
        for (char each : array2) {
            result = ArraysUtility.addElement(result, each);
        }
        return result;
    }


    //merge two given arrays and return a new one
    public static String[] merge(String[] array1, String[] array2){
        String[] result = {};

        for (String each : array1) {
            result = ArraysUtility.addElement(result, each);
        }
        for (String each : array2) {
            result = ArraysUtility.addElement(result, each);
        }
        return result;
    }





    public static void main(String[] args) {

        int[] array1 = {1,2,3,4};
        int[] array2 = {5,6,7,8};

        int[] array3 = merge(array1, array2);

        System.out.println(Arrays.toString(array3));

    }

}

package day26_CustomMethodPractice;

import java.util.Arrays;

public class MergeTwoArrays {
        
        //merges two given arrays and return a new one
        public static int[] merge(int[] array1, int[] array2 ){
            int[] result = new int[array1.length+ array2.length];

            int i = 0;

            for (int each : array1) {
                result[i++] = each;
            }
            for (int each : array2) {
                result[i++] = each;
            }
            return result;
        }


    //merges two given arrays and return a new one
    public static double[] merge(double[] array1, double[] array2 ){
        double[] result = new double[array1.length+ array2.length];

        int i = 0;

        for (double each : array1) {
            result[i++] = each;
        }
        for (double each : array2) {
            result[i++] = each;
        }
        return result;
    }


    //merges two given arrays and return a new one
    public static char[] merge(char[] array1, char[] array2 ){
        char[] result = new char[array1.length+ array2.length];

        int i = 0;

        for (char each : array1) {
            result[i++] = each;
        }
        for (char each : array2) {
            result[i++] = each;
        }
        return result;
    }


    //merges two given arrays and return a new one
    public static String[] merge(String[] array1, String[] array2 ){
        String[] result = new String[array1.length+ array2.length];

        int i = 0;

        for (String each : array1) {
            result[i++] = each;
        }
        for (String each : array2) {
            result[i++] = each;
        }
        return result;
    }
    
    


    public static void main(String[] args) {

            int[] array1 = {1,2,3,4};
            int[] array2 = {5,6,7,8};

            int[] array3 = merge(array1, array2);

        System.out.println(Arrays.toString(array3));

        System.out.println("-----------------------------------------------------------------");


        double[] arr1 = {1.1, 2.3, 3.3};
        double[] arr2 = {4.3, 4.5, 6.4};

        double[] arr3 = merge(arr1, arr2);
        System.out.println("arr3 = " +Arrays.toString(arr3));





    }


}

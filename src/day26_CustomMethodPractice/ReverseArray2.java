package day26_CustomMethodPractice;

import utilities.ArraysUtility;

public class ReverseArray2 {


    //reverses the given array and return new one
    public static int[] reverse(int[] array){

        int[] result = {};
            for (int i = array.length - 1; i >= 0; i--) {
            result = ArraysUtility.addElement(result, array[i]);
        }
        return result;
    }


    //reverses the given array and return new one
    public static double[] reverse(double[] array){

        double[] result = {};
        for (int i = array.length - 1; i >= 0; i--) {
            result = ArraysUtility.addElement(result, array[i]);
        }
        return result;
    }



    //reverses the given array and return new one
    public static char[] reverse(char[] array){

        char[] result = {};
        for (int i = array.length - 1; i >= 0; i--) {
            result = ArraysUtility.addElement(result, array[i]);
        }
        return result;
    }


    //reverses the given array and return new one
    public static String[] reverse(String[] array){

        String[] result = {};
        for (int i = array.length - 1; i >= 0; i--) {
            result = ArraysUtility.addElement(result, array[i]);
        }
        return result;
    }

// -----------------MAIN METHOD--------------------------------
    public static void main(String[] args) {

        char[] arrCh = {'A', 'B', 'C', 'D',  'E', 'F'};

        arrCh = reverse(arrCh);

        System.out.println(arrCh);

    }


}

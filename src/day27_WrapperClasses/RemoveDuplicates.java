package day27_WrapperClasses;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicates {

       //removes all duplicated elements from given array
        public static int[] removeDuplicates(int[] array){

            int[] result = {};

            for (int each : array) {
                if(!ArraysUtility.contains(result, each)){
                    result = ArraysUtility.addElement(result, each);
                }
            }
            return result;
        }
/* To remove duplicates we used two return method that we created in ArraysUtility class (under utility package)
before. After for each loop executed, each element of 'array' will be assigned to 'result' one by one.
 and if block will check, if the 'result' doesnt contains element it will be assigned, otherwise not.
 So duplicated elements will be eliminated.
 */


    //removes all duplicated elements from given array
    public static double[] removeDuplicates(double[] array){

        double[] result = {};

        for (double each : array) {
            if(!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }



    //removes all duplicated elements from given array
    public static char[] removeDuplicates(char[] array){

        char[] result = {};

        for (char each : array) {
            if(!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }



    //removes all duplicated elements from given array
    public static String[] removeDuplicates(String[] array){

        String[] result = {};

        for (String each : array) {
            if(!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }


//------------MAIN METHOD-----------------------
    public static void main(String[] args) {

        int[] arr1 = {1,1,1,1,2,2,2,2,3,4,5,5,5,5};

        arr1 = removeDuplicates(arr1);

        System.out.println(Arrays.toString(arr1));

        System.out.println("--------------------------------------------------------------");


        String[] arr2 = {"Ali", "Ali", "Veli", "Veli", "Veli", "Can", "Murat"};
        arr2 = removeDuplicates(arr2);

        System.out.println(Arrays.toString(arr2));



    }





}

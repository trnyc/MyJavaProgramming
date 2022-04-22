package day26_CustomMethodPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElement {
    public static void main(String[] args) {

        int[] array = {1,1,2,3,3,4,5,5,6,7,7,7,2,4,6};
        int[] unique = uniqueElements(array);

        System.out.println(Arrays.toString(unique));


        double[] array2 = {1.5, 2.5, 1.5, 3.5, 4.5, 4.5, 5.5, 5.5};
        double[] unique2 = uniqueElements(array2);

        System.out.println(Arrays.toString(unique2));

    }  // END OF MAIN METHOD


    //finds the unique elements in the given array
    public static int[] uniqueElements(int[] array){
        int[] result = {};

        for (int each : array) {
            if(ArraysUtility.frequencyOfElement(array, each) == 1){
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
 /* Here, to find the unique element in an int array, we used two custom methods that we created
 in ArraysUtility class. First we called frequencyOfElement method to find the elements that has
 1 frequency. And then, we called addElement method to assign these unique elements back to our
 result array. */

    }



    //finds the unique elements in the given array
    public static double[] uniqueElements(double[] array) {
        double[] result = {};

        for (double each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }



    //finds the unique elements in the given array
    public static char[] uniqueElements(char[] array) {
        char[] result = {};

        for (char each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }



    //finds the unique elements in the given array
    public static String[] uniqueElements(String[] array) {
        String[] result = {};

        for (String each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }











}


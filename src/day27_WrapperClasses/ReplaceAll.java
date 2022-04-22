package day27_WrapperClasses;

import java.util.Arrays;

public class ReplaceAll {


    //replaces targeting old elements with new ones
    public static int[] replaceAll(int[] array, int oldElement, int newElement){

        for (int i = 0; i < array.length; i++) {
            if(array[i] == oldElement){
                array[i] = newElement;
            }
        }
        return array;
    }



    //replaces targeting old elements with new ones
    public static double[] replaceAll(double[] array, double oldElement, double newElement){

        for (int i = 0; i < array.length; i++) {
            if(array[i] == oldElement){
                array[i] = newElement;
            }
        }
        return array;
    }



    //replaces targeting old elements with new ones
    public static char[] replaceAll(char[] array, char oldElement, char newElement){

        for (int i = 0; i < array.length; i++) {
            if(array[i] == oldElement){
                array[i] = newElement;
            }
        }
        return array;
    }




    //replaces targeting old elements with new ones
    public static String[] replaceAll(String[] array, String oldElement, String newElement){

        for (int i = 0; i < array.length; i++) {
            if(array[i].equals(oldElement)){
                array[i] = newElement;
            }
        }
        return array;
    }




    //---------------MAIN METHOD-------------------------
    public static void main(String[] args) {

        int[] arr = {10, 20, 300, 300, 40, 50, 300, 300};

        arr = replaceAll(arr, 300, 30);
        System.out.println(Arrays.toString(arr));


        System.out.println("=======================================================");


        String[] arr2 = {"Ali", "Veli", "Kazım", "Ali", "Ali", "Ali"};

        arr2 = replaceAll(arr2, "Ali", "Murat");
        System.out.println(Arrays.toString(arr2));


    }

}

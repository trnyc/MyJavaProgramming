package day27_WrapperClasses;

import java.util.Arrays;

public class Replace {


    //replace the element at given index with the given new element
    public static int[] replace(int[] array, int index, int newElement){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+ index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    //replace the element at given index with the given new element
    public static double[] replace(double[] array, int index, double newElement){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+ index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }


    //replace the element at given index with the given new element
    public static char[] replace(char[] array, int index, char newElement){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+ index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }


    //replace the element at given index with the given new element
    public static String[] replace(String[] array, int index, String newElement){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+ index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

// ----------------MAIN METHOD-------------------------------
    public static void main(String[] args) {

        int[] arr = {1,2,30,4,5};
        arr = replace(arr, 2,3);
        System.out.println(Arrays.toString(arr));//[1, 2, 3, 4, 5]


        System.out.println("____________________________________________");

        String[] arrStr = {"Ali", "Veli", "Kamil", "Hasan"};
        arrStr = replace(arrStr, 2, "Murat");

        System.out.println(Arrays.toString(arrStr));//[Ali, Veli, Murat, Hasan]



    }


}

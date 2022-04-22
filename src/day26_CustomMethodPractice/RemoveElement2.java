package day26_CustomMethodPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveElement2 {

   //removes the given index(element) from the array and returns a new one
    public static int[] removeElement(int[] array, int index){
        if(index < 0 || index > array.length -1){
            System.out.println("Invalid Index: "+ index);
            System.exit(0);
        }

        int[] result = {};

        for (int i = 0; i < array.length; i++) {
            if(i != index){//when any element of array doesnt match given index, add it to 'result'
                result = ArraysUtility.addElement(result, array[i]);//we called our addElement method
            }

        }
        return result;
    }


    public static void main(String[] args) {// MAIN METHOD STARTS HERE

        int[] a1 = {1,2,3,4,5,6,7};

        a1 = removeElement(a1, 4);
        System.out.println(Arrays.toString(a1));


    }




}

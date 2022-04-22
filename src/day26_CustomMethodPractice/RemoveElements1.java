package day26_CustomMethodPractice;

import java.util.Arrays;

public class RemoveElements1 {

    // removes given index/element from given array: {1,2,3,4,5} => remove element at index3
    public static int[] removeElement(int[] array, int index){
        if(index < 0 || index > array.length -1){
            System.out.println("Invalid Index: "+ index);
            System.exit(0);
        }
        int[] result = new int[array.length-1];//when we remove element our new array must be less than old one

        int j = 0;//j is for indexes of result
        for (int i = 0; i < array.length; i++) {
            if(i == index){//if index of 'array' matches given index
                continue;//skip
            }
            result[j++] = array[i];// all elements of 'array' will be moved to 'result' exept for given index
        }
        return result;
    }



    // removes given index/element from given array and returns new one
    public static double[] removeElement(double[] array, int index){
        if(index < 0 || index > array.length -1){
            System.out.println("Invalid Index: "+ index);
            System.exit(0);
        }
        double[] result = new double[array.length-1];//when we remove element our new array must be less than old one

        int j = 0;//j is for indexes of result
        for (int i = 0; i < array.length; i++) {
            if(i == index){//if index of 'array' matches given index
                continue;//skip
            }
            result[j++] = array[i];// all elements of 'array' will be moved to 'result' exept for given index
        }
        return result;
    }



    // removes given index/element from given array and returns new one
    public static char[] removeElement(char[] array, int index){
        if(index < 0 || index > array.length -1){
            System.out.println("Invalid Index: "+ index);
            System.exit(0);
        }
        char[] result = new char[array.length-1];//when we remove element our new array must be less than old one

        int j = 0;//j is for indexes of result
        for (int i = 0; i < array.length; i++) {
            if(i == index){//if index of 'array' matches given index
                continue;//skip
            }
            result[j++] = array[i];// all elements of 'array' will be moved to 'result' except for given index
        }
        return result;
    }



    // removes given index/element from given array and returns new one
    public static String[] removeElement(String[] array, int index){
        if(index < 0 || index > array.length -1){
            System.out.println("Invalid Index: "+ index);
            System.exit(0);
        }
        String[] result = new String[array.length-1];//when we remove element our new array must be less than old one

        int j = 0;//j is for indexes of result
        for (int i = 0; i < array.length; i++) {
            if(i == index){//if index of 'array' matches given index
                continue;//skip
            }
            result[j++] = array[i];// all elements of 'array' will be moved to 'result' exept for given index
        }
        return result;
    }
    
    
    

    //-------------------------------------------------------------------------------


    public static void main(String[] args) {// MAIN METHOD STARTS HERE

        int[] a1 = {1,2,3,4,5,6,7};

        a1 = removeElement(a1, 4);
        System.out.println(Arrays.toString(a1));


    }

























}

package utilities;

import java.util.Arrays;

public class ArraysUtility {

 // ALL THESE METHODS WERE TESTED IN THE CLASS TEST2 UNDER DAY25 PACKAGE

    // prints each element of an integer array in separate line
    public static void printEach(int[] array){// its void because it will not return anything, just will print
        for (int each : array) {
            System.out.println(each);
        }
    }


    // prints each element of a double array in separate line
    public static void printEach(double[] array){// its void because it will not return anything, just will print
        for (double each : array) {
            System.out.println(each);
        }
    }


    // prints each element of a char array in separate line
    public static void printEach(char[] array){// its void because it will not return anything, just will print
        for (char each : array) {
            System.out.println(each);
        }
    }


    // prints each element of a String array in separate line
    public static void printEach(String[] array){// its void because it will not return anything, just will print
        for (String each : array) {
            System.out.println(each);
        }
    }

//=================== FIND MAX ======================
    //returns the max number of integer array
    public static int max(int[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }


    //returns the max number of double array
    public static double max(double[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }


    //returns the min number of integer array
    public static int min(int[] numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }


    //returns the min number of double array
    public static double min(double[] numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }


//==================== CONTAINS =========================

    //checks if the given integer contained in given array, returns boolean
    public static boolean contains(int[] array, int element){
        boolean result = false;
        for (int each : array) {
            if(each == element){
                result = true;
            }
        }
        return result;
    }


    //checks if the given double contained in given array, returns boolean
    public static boolean contains(double[] array, double element){
        boolean result = false;
        for (double each : array) {
            if(each == element){
                result = true;

            }
        }
        return result;
    }


    //checks if the given char contained in given array, returns boolean
    public static boolean contains(char[] array, char element){
        boolean result = false;
        for (char each : array) {
            if(each == element){
                result = true;

            }
        }
        return result;
    }


    //checks if the given String contained in given array, returns boolean
    public static boolean contains(String[] array, String element){
        boolean result = false;
        for (String each : array) {
            if(each.equals(element)){
                result = true;

            }
        }
        return result;
    }


//---------------------- ADD ELEMENT --------------------

    //adds the given element to array and return new array
    public static int[] addElement(int[] array, int element){
        int[] result = new int[array.length + 1];

        int i =0;
        for (int each : array) {
            result[i++] = each;
        }
        result[i] = element;// now i is the last index of 'result' which is one more than 'array'

        return result;//check inside main method of day25_AddElements...overloading to see result
    }


    //adds the given element to array and return new array
    public static double[] addElement(double[] array, double element){
        double[] result = new double[array.length + 1];

        int i =0;
        for (double each : array) {
            result[i++] = each;
        }
        result[result.length-1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;
    }


    //adds the given element to array and return new array
    public static String[] addElement(String[] array, String element){
        String[] result = new String[array.length + 1];

        int i =0;
        for (String each : array) {
            result[i++] = each;//will add each element of 'array' to 'result'
        }
        result[result.length-1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;
    }


    //adds the given element to array and return new array
    public static char[] addElement(char[] array, char element){
        char[] result = new char[array.length + 1];

        int i =0;
        for (char each : array) {
            result[i++] = each;
        }
        result[result.length-1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;
    }


    //-----------------FIND FREQUENCY-----------------------------

    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(int[] array, int element){
        int count = 0;
        for (int each : array) {
            if(each == element){
                count++;
            }
        }
        return count;
    }


    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(double[] array, double element){
        int count = 0;
        for (double each : array) {
            if(each == element){
                count++;
            }
        }
        return count;
    }


    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(char[] array, char element){
        int count = 0;
        for (char each : array) {
            if(each == element){
                count++;
            }
        }
        return count;
    }


    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(String[] array, String element){
        int count = 0;
        for (String each : array) {
            if(each.equals( element )){
                count++;
            }
        }
        return count;
    }


 //===============FIND UNIQUE ELEMENT============================

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


    //-----------REMOVE ELEMENT--------------------------------------

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


    //----------------MERGE TWO ARRAYS----------------------------------


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


    //----------------REVERSE----------------------

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



    //============== REPLACE ELEMENT =================


    //replace the elements of the array at given index with the new element
    public static int[] replace(int[] array, int index, int newElement){

        if(index <0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        array[index] = newElement;
        return array;
    }


    //replace the elements of the array at given index with the new element
    public static double[] replace(double[] array, int index, double newElement){

        if(index <0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        array[index] = newElement;
        return array;
    }


    //replace the elements of the array at given index with the new element
    public static char[] replace(char[] array, int index, char newElement){

        if(index <0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        array[index] = newElement;
        return array;
    }


    //replace the elements of the array at given index with the new element
    public static String[] replace(String[] array, int index, String newElement){

        if(index <0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        array[index] = newElement;
        return array;
    }


   //==================REPLACE ALL======================

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



    //=================REMOVE DUPLICATES===========================

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



    //===================== INSERT ELEMENT ============================


    public static int[] insert(int[] array, int index, int element){

        if(index < 0 || index >= array.length){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }
        int[] result = new int[array.length+1];
        result[index] = element;

        for (int i = 0, j = 0; i < array.length; i++, j++) {
            if(i == index){
                j++;
            }
            result[j] = array[i];
        }
        return result;
    }


    public static double[] insert(double[] array, int index, double element){

        if(index < 0 || index >= array.length){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }
        double[] result = new double[array.length+1];
        result[index] = element;

        for (int i = 0, j = 0; i < array.length; i++, j++) {
            if(i == index){
                j++;
            }
            result[j] = array[i];
        }
        return result;
    }



    public static char[] insert(char[] array, int index, char element){

        if(index < 0 || index >= array.length){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }
        char[] result = new char[array.length+1];
        result[index] = element;

        for (int i = 0, j = 0; i < array.length; i++, j++) {
            if(i == index){
                j++;
            }
            result[j] = array[i];
        }
        return result;
    }



    public static String[] insert(String[] array, int index, String element){

        if(index < 0 || index >= array.length){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }
        String[] result = new String[array.length+1];
        result[index] = element;

        for (int i = 0, j = 0; i < array.length; i++, j++) {
            if(i == index){
                j++;
            }
            result[j] = array[i];
        }
        return result;
    }



    //================= SWAP ELEMENTS ==============================


    //swaps element at given index with elemment given second index
    public static int[] swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

        return array;
    }


    //swaps element at given index with elemment given second index
    public static double[] swap(double[] array, int i, int j){
        double temp = array[i];
        array[i] = array[j];
        array[j] = temp;

        return array;
    }



    //swaps element at given index with elemment given second index
    public static char[] swap(char[] array, int i, int j){
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;

        return array;
    }


    //swaps element at given index with elemment given second index
    public static String[] swap(String[] array, int i, int j){
        String temp = array[i];
        array[i] = array[j];
        array[j] = temp;

        return array;
    }




}

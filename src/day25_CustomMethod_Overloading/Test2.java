package day25_CustomMethod_Overloading;

import utilities.ArraysUtility;

public class Test2 {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5,};
        ArraysUtility.printEach(arr1);


        System.out.println("=====================================");

        double[] arr2 = {1.5, 2.5, 3.5, 5.4};
        ArraysUtility.printEach(arr2);

        System.out.println("==================================");


        char[] arr3 = {'A', 'B', 'C', 'E'};
        ArraysUtility.printEach(arr3);


        System.out.println("==================================");


        String[] arr4 = {"Ali", "Veli", "Kamil", "Hasan"};
        ArraysUtility.printEach(arr4);


        System.out.println("---------------------------------------");


        int[] num1 = {2, 4, 6, 8, 1, 3};
        int max1 = ArraysUtility.max(num1);
        System.out.println("Max integer: " + max1);


        System.out.println("===================================");


        double[] num2 = {2.4, 4.2, 6.1, 8.3, 1.7, 3.9};
        double max2 = ArraysUtility.max(num2);
        System.out.println("Max double: " + max2);


        System.out.println("===================================");


        int[] a1 = {1,2,3,4,5,6,7};
        //System.out.println(ArraysUtility.contains(a1, 5));
        boolean r1 = ArraysUtility.contains(a1, 5);
        System.out.println("r1 = " + r1);



    }
}

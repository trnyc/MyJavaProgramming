package topicsKahoot.week11_Strings_Arrays_ArrayList_Methods_B28;

import java.util.Arrays;

public class Q6_OutputArrayCode {
    public static void main(String[] args) {
        int [] fun= new int[5];
        fun[0]= 1;
        fun[1]= 2;
        fun[2]=3;
        fun[3]=4;
        fun[4]= 5;

        int j= 3;

        System.out.println("Arrays.toString(fun) = " + Arrays.toString(fun));// List the all numbers
        System.out.println("fun[j] = " + fun[j]);// the result is 4, which corresponds the index number 3
        System.out.println(fun[j - 1]);  // The result is "3" because it asks for the index number 2, which is 3



    }




}

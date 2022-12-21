package abc_Practice_B28.review_arrayB28_week09;

import java.util.Arrays;

public class Q8Mx_NumsIndex {
    public static void main(String[] args) {  // Slide 9 - 16 Question 8
        int numbers[];
        numbers = new int[2];
        numbers[0] = 10;
        numbers[1] = 20;

        numbers = new int[4];
        //System.out.println(Arrays.toString(numbers));
        numbers[2] = 30;
        numbers[3] = 40;

        System.out.println(Arrays.toString(numbers));  // Output= [0, 0, 30, 40]


    }
}

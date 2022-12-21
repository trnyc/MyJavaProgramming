package abc_Practice_B28.review_arrayB28_week09;

import java.util.Arrays;

public class Q1Mx_Java {
    public static void main(String[] args) { // Slide 2-9 Question 1
        
        String str1= "Java";
        String [] str2= { "J", "a", "v", "a" };
        String str3= "";



        for (int i = 0; i < str2.length; i++) {
            str3  += str2[i];
            }

        System.out.println(str1);
        System.out.println(Arrays.toString(str2));
        System.out.println(str3);

        boolean b1 =  str1 == str3; // false
        boolean b2 = str1.equals(str3);// true


        System.out.println( b1 + " " + b2);  // Output= false true
        
    }
    
    
}

package utilities;

import java.util.Arrays;

public class StringUtility {


    // prints each character of given string
    public static void printEachChar (String str){

         for (int i = 0; i < str.length() ; i++) {
            System.out.println(str.charAt(i));// Go day1 package and see how to use this method in another
                                            // package/class (test2) and day25 (test)

        }
    }


    // reverses the given string and returns it
    public static String reverse (String str){

        String result = "";

        for (int i = str.length()-1; i >= 0; i--) {
            result += str.charAt(i);

        }
        return result;
    }


    //checks if the given string is palindrome and returns boolean
    public static boolean isPalindrome(String str){
        return reverse(str).equalsIgnoreCase(str);// we used previous 'reverse' method here

    }


    //checks if the given string is anagram (made of same letters)
    public static boolean anagram(String str1, String str2){

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1, ch2);

    }


    //removes the duplicates in given string
    public static String removeDuplicates(String str){//aaabbbccd => abcd
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if(!result.contains(""+each)){
                result +=  each;
            }
        }
        return result;
    }




}

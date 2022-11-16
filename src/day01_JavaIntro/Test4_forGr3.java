package day01_JavaIntro;

import java.util.Arrays;

public class Test4_forGr3 {

    public static void main(String[] args) {

// frequency
        /*  String str = "aaabbbcccddd";

        String freqResult = frequencyOfChars1(str);

        System.out.println(freqResult);*/



// is Same
       /* String str1 = "hi how are you?";
        String str2 = "how are you hi?";

        boolean isSame = same(str1, str2);

        System.out.println(isSame);*/


// Remove duplicates

        /*String str = "aaabbbcccdacb";

        String result = removeDup(str);

        System.out.println(result);*/


// Find uniques

        String str3 = "aaabbbcccdef";

        String result3 = unique(str3);

        System.out.println(result3);







    }

/* String -- Frequency of Characters
Write a return method that can find the frequency of characters

Ex:  FrequencyOfChars("AAABBCDDA") ==> A3B2C1D2
                        AAABBCDDA
*/

    public static String frequencyOfChars1(String str) {
        String expectedResult = "";
        int j = 0;
        while (j < str.length()) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            expectedResult += str.charAt(j) + "" + count;
            str = str.replace("" + str.charAt(j), "");
        }
        return expectedResult;
    }

    /* Anagram
    Write a  function that check if a string is build out of the same letters as another string.
            Ex: same("abc", "cab"); -> true , Solution 1:
                same("abc", "abb"); -> false:

     */

    // solution 1:
    public static boolean same(String a, String b) {
        char[] ch1 = a.toCharArray();
        char[] ch2 = b.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        String a1 = "", a2 = "";

        for (char each : ch1) {
            a1 += each;
        }

        for (char each : ch2) {
            a2 += each;
        }

        return a1.equals(a2);
    }

   /* String -- Remove Duplicates
    Write a return method that can remove the duplicated values from String

    Ex:  removeDup("AAABBBCCC")  ==> ABC*/

    public static String removeDup(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (!result.contains("" + str.charAt(i))) {
                result += "" + str.charAt(i);
            }
        }

        return result;
    }

    /*String -- Find the unique
    Write a return  method that can find the unique characters from the String

    Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";*/

    public static String unique(String str) {
        String[] arr = str.split("");
        String unique1 = "";

        for (int j = 0; j < arr.length; j++) {
            int num = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals(arr[j])) {
                    num++;
                }
            }
            if (num == 1) {
                unique1 += arr[j];
            }
        }

        return unique1;
    }



}

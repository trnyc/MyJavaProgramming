package day25_CustomMethod_Overloading;

import utilities.StringUtility;//shortcut to import this class here: type StringUtility and hit enter

public class Test {
    public static void main(String[] args) {

        String str = "Java Programming Language";
        StringUtility.printEachChar(str);

        System.out.println("--------------------------------------");

        String str1 = "Cydeo School";//revrse it
        String reversedStr1 = StringUtility.reverse(str1);
        System.out.println(reversedStr1);

        System.out.println("----------------------------------------");

        String word = "Civic";//check if its palindrome
        boolean palindrome = StringUtility.isPalindrome(word);
        System.out.println("palindrome = " + palindrome);

        System.out.println("-------------------------------------------");

        //check how many palindrome are there
        String[] names = {"Anna", "Java", "Python", "racecar", "Mom", "Cydeo"};

        int count = 0;

        for (String each : names) {
            if (StringUtility.isPalindrome(each)) {
                count++;
            }
        }
        System.out.println(count);

        System.out.println("-----------------------------------------------------");

        String str3 = "aaaaabbbbbbcddddeee";

        str3 = StringUtility.removeDuplicates(str3);
        System.out.println(str3);



    }
}

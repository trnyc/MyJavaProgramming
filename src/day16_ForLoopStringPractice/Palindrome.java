package day16_ForLoopStringPractice;

public class Palindrome {
    public static void main(String[] args) {

/* palindrome means, the words that original and reversed versions are same.
such as => anna, level, rececar, mam, dad .....
** write a program to check the word if its a palindrome or not.
 */
        String word = "level";//you can input any word to check if its palindrome
        String reversed = "";
// fori is the short cut for loop

        for (int i = word.length()-1; i >= 0 ; i--) {
            reversed += word.charAt(i);
        }
        boolean isPalindrome = word.equalsIgnoreCase(reversed);

        System.out.println("isPalindrome = " + isPalindrome);


    }
}

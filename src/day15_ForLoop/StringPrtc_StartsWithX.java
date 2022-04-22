package day15_ForLoop;

import java.util.Scanner;

public class StringPrtc_StartsWithX {
    public static void main(String[] args) {

        System.out.println("Enter a word");
        String word = new Scanner(System.in).next();
/* NOTE: if you will use user input only once in your codes, you dont
have to put a scanner object in your codes
(like Scanner scan = new Scanner(System.in); Instead you can do directly
like above. And you dont have to close Scanner. */

        if(word.charAt(0) == 'x'){
            word = word.replaceFirst("x" , "a");
        }

        System.out.println(word);

    }
}

/*
1. Write a program that asks user to enter a word. If the word starts with x,
    replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex
 */
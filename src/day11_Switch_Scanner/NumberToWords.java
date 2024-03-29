package day11_Switch_Scanner;

public class NumberToWords {
    public static void main(String[] args) {

        int number = -1;

        String result = (number >= 0 && number <= 9) ?
                (number == 0) ? "Zero" : (number == 1) ? "One" : (number == 2) ? "Two"
                        : (number == 3) ? "Three" : (number == 4) ? "Four" : (number == 5) ? "Five"
                        : (number == 6) ? "Six" : (number == 7) ? "Seven" : (number == 8) ? "Eight" : "Nine"
                : "Invalid Number";

        System.out.println(result);

/*This is a sample of nested if statement with ternaries. The first "?" is "if statement"
of nested if (pre condition) and the last ":" is "else" statement of nested if.
between is other if statements.
 */

    }

}

/*
2. Write a program that can convert numbers 0~9 to words.
		NOTE: MUST use ternary
 */

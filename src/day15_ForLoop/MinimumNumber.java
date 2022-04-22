package day15_ForLoop;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int min = 2147483647;//this is the max number that can be assigned to an int

        for (int i = 0; i <5; i++) {//Loop will be executed 5 times to get 5 input
            System.out.println("Enter a number:");
            int input = scan.nextInt();
            if(input < min){
                min = input;
            }
        }
        System.out.println("The minimum number is: "+min);

        scan.close();

/* we assigned to the variable 'min' the largest number that an int can get.
So, any number that the user entered will be smaller than this. And we put a
condition if statement that any input that was entered by user will be assigned
to the variable 'min', if its smaller than the previous one. Otherwise it will
not. At the end only the minimum number among 5 input will be printed as the
minimum number.
 */


    }
}
/*
Write a program that asks the user to enter a number for 5 times.
return the minimum number
 */
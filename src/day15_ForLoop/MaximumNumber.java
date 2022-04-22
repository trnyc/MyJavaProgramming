package day15_ForLoop;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int max = -2147483648;//this is minimum number that we can assign for int
//So, any number that user input, will be greater than this.
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number:");
            int input = scan.nextInt();
            if(input > max){//if the input is greater than max,
                max = input;//assign it to max every time(see explanation)
            }
        }
        System.out.println("The maximum number is: "+ max);





/* Every time user input a number, it will be assigned to variable 'max' if the
input is greater than 'max' at that time. Means: for ex; user input 5 at first time,
and it was assigned to 'max', and 'max=5' now. As second input user enter 8 for ex.
Since 8 is greater thant 5, according to condition inside if statement, max=8 now.
For third input, user entered 3 for ex. Since 3 is not greater than 8, operator
will not assign it to variable 'max'. So still max=8. For forth input user
entered 15 for ex. Since 15 is greater than 8, now max=15 .... and so on...
 */


    }
}


/*
Write a program that asks the user to enter a number for 5 times.
return the maximum number
 */
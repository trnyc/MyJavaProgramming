package day15_ForLoop;
import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
//short cut of "for loop"==> type 'fori' and press enter
//TASK: Find sum of the numbers 1-100

        int sum = 0;
        for (int i = 1; i < 101 ; i++) {
            sum += i;// add to sum every number
        }
        System.out.println(sum);//sum of numbers 1-100=5050

        System.out.println("_______________________________________________");

//TASK: Ask user to input 5 number and find sum of these numbers.

        int total = 0;
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5 ; i++) {

            System.out.println("Enter a number:");
            total += scan.nextInt(); //add every input to 'total'

        }
        System.out.println("total = " + total);

        scan.close();



    }
}

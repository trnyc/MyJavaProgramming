package day17_While_DoWhile;


import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first number:");
        int num1 = scan.nextInt();

        System.out.println("Enter your second number:");
        int num2 = scan.nextInt();

        System.out.println("Enter a math operator: ");
        char ch = scan.next().charAt(0);


        while(  !(ch == '+' || ch == '-') ){ // if the operator is INVALID
            System.err.println("Invalid Operator, Please re-enter");
            ch = scan.next().charAt(0);//'err' prints error message in red color
        } //will execute until user input a valid operator

        System.out.println(  (ch =='+') ?  num1+num2  : num1 -num2 );
// if ch = + , add two numbers, otherwise (means if ch = -) subtract two numbers(ternary)


        /*   **you can use for loop for same task but its not advised**

        for(int i =0; !(ch == '+' || ch == '-'); ){
            System.err.println("Invalid Operator, Please re-enter");
            ch = scan.next().charAt(0);
        }
        System.out.println(  (ch =='+') ?  num1+num2  : num1 -num2 );
        */




    }
}

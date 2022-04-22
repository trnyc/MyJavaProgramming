package day11_Switch_Scanner;

import java.util.Scanner;//you can insert automatically this import line by typing
                        // "Scan" inside the main method and hit the enter
public class Scanner_Intro {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer");
        int num1 = input. nextInt();

        System.out.println("Enter a decimal");
        double num2 = input.nextDouble();

        System.out.println(num1);
        System.out.println(num2);

        System.out.println("Multiplication: "+ (num1*num2));

        input.close();/*this is to close Scanner method and avoid running
                        at the back that is using memory. not mandatory.
                        you can not use Scanner anymore after this line.
                     */

    }
}

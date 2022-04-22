package day17_While_DoWhile;

import java.util.Scanner;

public class BranchingStatements {
    public static void main(String[] args) {

        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i + " ");
            // This will print uppercase A to Z. what if I want to print A to F?

            if(i == 'F'){
                break;//when it comes to F it will exit the loop
/*if you put if statement after print statement it includes 'F', if you put if statement
before print statement it does not include 'F'.
 */

            }

        }

        System.out.println();
        System.out.println("-------------------------------------------");

        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("Enter a number: ");
            int num = scan.nextInt();
            if(num < 0){//will exit if the num less than zero
                break;
            }
        }






    }
}

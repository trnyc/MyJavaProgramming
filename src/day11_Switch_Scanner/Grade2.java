package day11_Switch_Scanner;

public class Grade2 {
    public static void main(String[] args) {
/* This is how to use "or logic" in SWITCH statement without using ||.
 We will use case blockswithout any print statement or break.
 So it will not print anything until it reaches print statement after
 forth case block. We can use case blocks in one line in this situation.
 */

        char ch = 'z';
        String result = "";

        switch(ch) {

            case 'A': case 'B': case 'C': case 'D':
                result = "Passed";
                break;
            case 'F':
                result = "Failed";
                break;

            default:
                result = "Invalid";
        }

                System.out.println(result);




    }
}

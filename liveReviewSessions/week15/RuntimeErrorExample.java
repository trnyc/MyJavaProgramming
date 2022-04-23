package week15;

import java.util.Scanner;

public class RuntimeErrorExample {
    public static void main(String[] args) {

        System.out.println("Hello");

       // System.out.println(5/0); // runtime error (unchecked exception), you can see only when you run your codes
                                    // you can not run your codes if you dont handle it

        Scanner scan = new Scanner(System.in);
        int x = 5;
        int y = scan.nextInt();

        // if there is a line of code that I might get exception expectation
        try {
            System.out.println( x / y );  // when user puts zero this line will be skipped
        }catch(Exception e){

        }

        System.out.println("How are you");
        System.out.println("Some more line of codes");
        System.out.println("we swallowed the exception object");// so we can run our codes





    }
}

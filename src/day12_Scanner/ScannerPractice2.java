package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

    //    System.out.println("Enter ture or false:");
    //    boolean result = scan.nextBoolean();

        System.out.println("Enter your name:");
        String name = scan.next();// "next" reads the line only until a space
                                 // so you can use only one word
        System.out.println("name = " + name);
        //if user inputs two words, it reads onyly the first one

        scan.close();

    }
}

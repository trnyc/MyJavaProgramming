package day01_JavaIntro;

import java.util.Scanner;

public class Test12_Bank_Credentials {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        String username = "Cydeo",
                password = "Cydeo123";
        int n = 3;

        System.out.println("Enter your username ");
        String username1 = input.next();

        System.out.println("Enter your password ");
        String password1 = input.next();

        while (!username1.equals(username) || !password1.equals(password)) {
            if (n == 0) {
                System.out.println("Your account is locked.");
                break;
            }
            System.out.println(n-- + " attempt left");

            System.out.println("Enter your username ");
            username1 = input.next();

            System.out.println("Enter your password ");
            password1 = input.next();
        }

        if (username1.equals(username) && password1.equals(password)) {
            System.out.println("Logged in.");
        }

    }
}

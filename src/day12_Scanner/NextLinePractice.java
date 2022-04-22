package day12_Scanner;

import java.util.Scanner;

public class NextLinePractice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = scan.nextInt();

        scan.nextLine();// this line to make the scanner memory empty before nextLine

        System.out.println("Enter your full name:");
        String fullName = scan.nextLine();

        System.out.println("Enter your GPA:");
        double gpa = scan.nextDouble();

        scan.nextLine();//<<== this is important to use not to cause problem

        System.out.println("Enter your school name");
        String schoolName = scan.nextLine();

        System.out.println("age = " + age);
        System.out.println("fullName = " + fullName);
        System.out.println("gpa = " + gpa);
        System.out.println("schoolName = " + schoolName);


        scan.close();
    }
}

/*
1- Ask user to enter the age
2- Ask user to enter full name
 */
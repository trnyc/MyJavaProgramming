package day13_String;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = scan.next();
        System.out.println("Enter your last name");
        String lastName = scan.next();

        char f = firstName.charAt(0);//this will take first character of first name
        char l = lastName.charAt(0);//this will take first character of last name

/* in java every string has an index number starting from 0(zero)
Ex: Wooden => 0123456. So 0 stands for 'W' and 6 stands for 'n'
 */

      //String initial = ""+ f + l;//to convert a char into String put an empty ""
        String initial = f + "."+ l; //or put a "." between

        System.out.println("initial = " + initial);


    }
}

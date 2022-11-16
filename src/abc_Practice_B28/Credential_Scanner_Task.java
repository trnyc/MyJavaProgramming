package abc_Practice_B28;

import java.util.Scanner;

public class Credential_Scanner_Task {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your username:");
        String userName = scan.nextLine();

        System.out.println("Enter your password:");
        String passWord = scan.nextLine();


        if (userName.equals("Cydeo") && passWord.equals("Cydeo123")) {
            System.out.println("Logged in");
        } else {
            for (int i = 1; i < 3; i++) {
                System.err.println("Invalid username or password\nReenter your username and password:");
                userName = scan.nextLine();
                passWord = scan.nextLine();
            }
            System.err.println("Your account is locked!");
        }



    }
}
/*   you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have
                three attempts to enter correct credentials and if all three attempts are failed,
                then print "Your account is lucked."*/
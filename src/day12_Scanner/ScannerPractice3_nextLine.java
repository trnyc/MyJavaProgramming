package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_nextLine {
    public static void main(String[] args) {

/* nextLine method reads everything written on the line, even when you press
enter key.
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your full name: ");
        String fullName = scan.nextLine();

        System.out.println("Enter your programming language");
        String programming = scan.nextLine();

        System.out.println("Enter your age");
        int age = scan.nextInt();

        scan.nextLine();
        System.out.println("Enter your school name");
        String schoolName = scan.nextLine();

/*   "nextLine" works different than other methods. It reads everything until pres enter
key. Also it reads the enter key if you used another "next" method before "nextLine"
method. So if you want to use another "next" method before "nextLine", you must type
an empty scanner object "nextLine" to delete enter key from the memory. Otherwise it will
skip next line without letting you input data. SO: all other methods (nextInt, nextDouble,
nextFloat etc.) ignore the enter key BUT NOT "nextLine".
 */

        System.out.println("fullName = " + fullName);
        System.out.println("programming = " + programming);
        System.out.println("age = " + age);
        System.out.println("schoolName = " + schoolName);

        scan.close();


    }
}

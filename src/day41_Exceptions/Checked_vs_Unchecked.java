package day41_Exceptions;

import day39_Recap.cydeoTask.Student;

public class Checked_vs_Unchecked {
    public static void main(String[] args) {

        // unchecked exceptions:

        int a = 10;
        int b = 0;

        //System.out.println( a/b );// this is an unchecked exception because it occured during runtime, not compile time

        //------------------------------------------------------------------------------

        char[] characters = {'A', 'B', 'C'};

        //System.out.println(characters[9]);
    // this will give 'out of bound exception' which is an unchecked exception

        //-----------------------------------------------------------------------------

        Student student = null;

        //System.out.println(student.getName());  does not work
        //student.study();

        final String str = "Wooden Spoon";

        //str = null; can not be changed bac. its 'final'
        //System.out.println(str.toUpperCase());

        String str2 = ""; // object != null; its not null but empty.
        System.out.println(str2.isEmpty());

        System.out.println("-----------------------------------------------------------------------");

        //checked Exceptions

        System.out.println("Hello");

        //Thread.sleep(3000); Checked exception occurse during compiling, writing the codes, and gives error
        // immediately. You can not run the codes unles you handle the issue.

        System.out.println("Cydeo");

        //FileInputStream file = new FileInputStream("path of the file"); ==> CHECKED EXCEPTION

        //System.out.println("Java".charAt(100)); ==> UNCHECKED EXCEPTION



















    }
}

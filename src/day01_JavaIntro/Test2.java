package day01_JavaIntro;

import utilities.StringUtility;

public class Test2 {

    public static void main(String[] args) {
/* to be able to use another method here, firs we need to import
it here by typing package and class name.
import utilities.StringUtility; (see line3)
And then type the class name to use it.
 */
        String str = "Wooden Spoon";
        StringUtility.printEachChar(str);

        int a = 25;

        System.out.println(a++); //25
        System.out.println(a--); //26

        System.out.println(a);  //25

        String str1 = "java";
        String str2 = "java";
        System.out.println( str1.equals(str2));
        System.out.println( str1 == str2 );


        String str3 = new String("java");

        System.out.println( str1.equals(str3) );
        System.out.println( str1 == str3 );


    }
}

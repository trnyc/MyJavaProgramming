package day13_String;

public class StringIntro {
    public static void main(String[] args) {
/*
Normally you must import any class in order to use it. Like Scanner class.
But String class is a special one that it is implicitly imported whenever
you use it. Because any class under java.lang package can be imported implicitly
by the compiler.
 */
        String name = "Wooden Spoon";
        String name2 = "Wooden Spoon";
        String name3 = "Wooden Spoon";
        String name4 = "Wooden Spoon";

        System.out.println(name  == name2);// true bec. there is only one object that was assigned to 4 dif. variables
        System.out.println(name2 == name3 ); // true
        System.out.println(name3 == name4); // true

        System.out.println("------------------------------------");

        String str1 = new String("Wooden Spoon");
        String str2 = new String("Wooden Spoon");
        String str3 = new String("Wooden Spoon");
        String str4 = new String("Wooden Spoon");

        System.out.println( str1 == str2 ); // false bec. they are four dif. objects even if visibly same
        System.out.println( str2 == str3 ); // false  see the pdf for details
        System.out.println( str3 == str4); // false

        System.out.println("----------------------------------");
        String s1 = "Java";
        String s2 =new String("Java");

        System.out.println( s1.equals(s2) );// true bec. equals method checks only strings, not value


        String s3 = "Java";
        String s4 =new String("java");

        System.out.println( s3.equals(s4) ); // false bec. case sensitive
    }
}

package day01_JavaIntro;

public class Test8 {
    public static void main(String[] args) {

        String str = "CydeoSchool";

        System.out.print(str.substring(5, 6));
        System.out.println(str.indexOf('o'));

        String ta = "A";
        ta += "B";
        System.out.println(ta);
        String tb = "C";
        ta += tb;
        System.out.println(ta);
        ta.replace('C', 'D');
        System.out.println(ta);

        System.out.println("-----------------------------------");

        String s1 = "abc";
        String s2 = "abc";
        System.out.println("s1 == s2 is: " + s1 == s2);


        byte a = 10;
        byte b = 15;

        //byte c = a + b;  //compile error. because when yuo use a byte data type with an arithmatic operator
                            // java takes it as int

        int d = a + b;

        String ab = "ali veli kemal huseyin";
        int result = ab.indexOf("li", 5);

        System.out.println("result = " + result);


    }
}

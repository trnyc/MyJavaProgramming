package topicsKahoot.week11_Strings_Arrays_ArrayList_Methods_B28;

public class Q3_SubStringIndexOf {

    public static void main(String[] args) {

        String s1= "Welcome to Java";
        System.out.println("s1.substring(0,0) = " + s1.substring(0, 0)); // beginning and ending indexes are expected to be different
        System.out.println("s1.substring(1,1) = " + s1.substring(1, 1));// If same, the result gives an empty string
        System.out.println("s1.substring(2,2) = " + s1.substring(2,2)); // Beginning index: gets the character of the exact index number; but, ending index: gets the character of the -1 index number.
        System.out.println("s1.substring(2,3) = " + s1.substring(2, 3));
        System.out.println("s1.substring(2,4) = " + s1.substring(2, 4));


        System.out.println("s1.substring(3,3) = " + s1.substring(3, 3));
       // System.out.println(s1.substring(3, 3)); Output Empty
        System.out.println("s1.indexOf('o') = " + s1.indexOf('o'));// output it returns the first "o", 4
        System.out.println("s1.lastIndexOf('o') = " + s1.lastIndexOf('o'));// it returns the last "o", 9


    }

}

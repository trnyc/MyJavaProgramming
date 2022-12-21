package abc_Practice_B28.week11_Strings_Arrays_ArrayList_Methods_B28;

public class Q2_StringIndexOutofBoundsException {

    public static void main(String[] args) {

//Question 2
String s = "Java String Quiz";
        //  0123456789012345  ====}  index numbers 0 through 15

        System.out.println("s.length() = " + s.length());// it returns 16
        System.out.println(s.toUpperCase());  //   JAVA STRING QUIZ    it will capitalize/uppercase the letters of the String s
       // System.out.println("s = " + s);
        System.out.println(s.toUpperCase().length()); // it prints '16',which is the length of String s, number of characters
       // System.out.println("s.length() = " + s.length()); // "16"
        System.out.println(s.charAt(15)); // 'z' gives us the character of the last index, which ranges from 0 to 15

        System.out.println(s.charAt(16)); // StringIndexOutOfBoundsException - illegal index
        System.out.println(s.charAt(s.toUpperCase().length())); // Same with the above line. Another way of writing the number of 16


    }




}

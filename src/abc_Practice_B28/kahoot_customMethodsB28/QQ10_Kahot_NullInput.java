package abc_Practice_B28.kahoot_customMethodsB28;

public class QQ10_Kahot_NullInput {

    public static void main(String[] args) {


        String input = null;
        System.out.println("-" + input.trim() + "-");


        //  System.out.println(input.trim()+ "-");
        // System.out.println("-"+input.trim());
        // Output/?NullPointerException
        //   System.out.println(input.trim());


//        System.out.println(input);
//        String input2= "";
//        System.out.println("-"+input2.trim() +"-");

 /*
 * trim() method can not find any object to operate on it.
 * The Java programming language distinguishes between "null" and" empty strings".
 * An empty string is a string instance of zero length, whereas a null string has no value at all.
 * An empty string is represented as "". It is a character sequence of zero characters.
 * A null string is represented by null. It can be described as the absence of a string instance.
 *

 * In Java, there is a distinct difference between null, empty, and blank Strings.
 * An empty string is a String object with an assigned value, but its length is equal to zero.
 * A null string has no value at all.
 * A blank String contains only whitespaces, are is neither empty nor null,
   since it does have an assigned value, and isn't of 0 length.

        String nullString = null;
        String emptyString = "";
        String blankString = " ";
 */


    }

}

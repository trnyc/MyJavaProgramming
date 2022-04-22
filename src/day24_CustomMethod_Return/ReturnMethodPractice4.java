package day24_CustomMethod_Return;

public class ReturnMethodPractice4 {

    //Create a method that can remove duplicated characters from a string and returns the new value

    public static String removeDuplicates(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if (!result.contains("" + each)) {
                result += each;
            }
        }

        return result;

    }// END OF CUSTOM (RETURN) METHOD


    public static void main(String[] args) {

        String str = "aaaabbbbcccccddddeeeeeefffffff";

        str = removeDuplicates(str);

        System.out.println(str);//abcdef

    }

}
/* SEE PACKAGE DAY1 FOR HOW TO IMPORT AND USE ANY OTHER CUSTOM (RETURN) METHOD FROM
ANOTHER PACKAGE AND CLASS AND USE IT
 */




package day01_JavaIntro;

import day24_CustomMethod_Return.ReturnMethodIntro;
import day24_CustomMethod_Return.ReturnMethodPractice4;

public class TestForImportCustomMethod {
    public static void main(String[] args) {

/* HOW TO IMPORT AND USE ANY OTHER CUSTOM (RETURN) METHOD FROM
ANOTHER PACKAGE AND CLASS AND USE IT
==> TYPE NAME OF THE CLASS THAT INCLUDES THE METHOD YOU WANT TO
USE. INTELLIJ WILL SHOW YOU A SHORT CUT, JUST HIT THE ENTER.
AND THAN TYPE THE NAME OF THE METHOD YOU WANT TO USE.
 */

        String str = "aaaaaabbbbbcccdddefgggggg";

        str = ReturnMethodPractice4.removeDuplicates(str);

        System.out.println(str);

        System.out.println("==============================");

        String str1 = "Java Progamming";



        String reversedStr1 =  ReturnMethodIntro.reverse(str1);
        System.out.println(reversedStr1);








    }
}

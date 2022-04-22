package day14_String;

public class StringMethods3_Substring {
    public static void main(String[] args) {

/* substring method is used to get some portion of a string by using index
number of it.
 */
        String word = "Cydeo School";
//                     123456..  every character has an index, even space

        String brand1 = word.substring(0, 4);// this will give "Cyde",from 0 to 3
        System.out.println(brand1);
 /* substring method exclude the number you use at the end. So the line above
 will give you the string of index number 0123 excluding 4, which is "Cyde"
 not "Cydeo" that we want.
  */
        String brand2 = word.substring(0, 5);
        System.out.println(brand2);

        String str1 = word.substring(6);// This will give you "School"
/*  When you want to get a string portion at end of a string, you need to put
only starting index number, no need to mention the ending index number.
So, if you give only one index, it will print rest of the string starting
from given index.
 */
        System.out.println(str1);

        System.out.println("----------------------------------------");

        String word2 = "Java Programming Language";
/* How to get first, second and third word of string above without even
counting index number of the letters?
 */
        String s1, s2, s3; //for three word separately

        s1 = word2.substring(0, word2.indexOf(" ")); //Java
 // to get the letters between 0 and first space. substring exclude last index you give

        s2 = word2.substring(word2.indexOf(" ")+1 , word2.lastIndexOf(" "));//Programming
 //to get the letters between two spaces, which is second word of the string

        s3 = word2.substring(word2.lastIndexOf(" ")+1);
 /*  if your word you want to get is at the end, when you give the starting index
 of the word, it will get till the end, so no need to mention the ending index.
    So, even if you change the string above, you will get first, second and
    third words of the string as s1, s2 and s3.
  */

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);






    }
}

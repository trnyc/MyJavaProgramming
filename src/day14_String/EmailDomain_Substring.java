package day14_String;

public class EmailDomain_Substring {
    public static void main(String[] args) {

/* Write a program to get the domain of an email.
in every email address, domain is between "@" and "."
So no matter the email address is; your program
should be universal, usable for every email address
 */

        String email = "Cydeo.School@gmail.com";

        int beginningIndex = email.indexOf("@") +1;
        int endingIndex = email.lastIndexOf(".");

        String domain = email.substring(beginningIndex, endingIndex);
        System.out.println("domain = " + domain);

        System.out.println("---------------------------------------------");

        String str1 = "Java is fun, Java is cool, I love Java";
        String s1 = str1.substring(0, 10+1); //to get "Java is fun"

        int beg = str1.indexOf(" J") +1;//first letter of "Java is cool"
        int end = str1.lastIndexOf(",");//last letter of "Java is cool"

        String s2 = str1.substring(beg, end);// will give "Java is cool"

        String s3 = str1.substring( str1.lastIndexOf("I") );//I love Java

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);







    }
}

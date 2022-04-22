package day14_String;

public class StringMethods2 {
    public static void main(String[] args) {

        String str = "Java is fun, I love learning Java";
        str = str.replace("Java" , "Python");
/* replace method doesnt change old string but create a new string after it
changed the word you want.
 */
        System.out.println(str);


        String email = "JohnSmith@yahoo.com"; //change it to gmail

        email = email.replace("yahoo" , "gmail");
        System.out.println("email = " + email);


        String sentence = "Java Java Python Python C# C# C++ C++ Python Python Python Python";
        // How to remove words Python in the string?

        String sentence2 = sentence.replace("Python" , "");
        // Dont forget there will be more spaces between words in new version

        sentence2 = sentence2.replace("   ", " ");
        System.out.println("sentence2 = " + sentence2);
        //So first we removed the word Python and then remaining spaces

        String s = "Dog Dog Dog Dog Dog Dog"; // replace all the dogs with cats
        s = s.replace("Dog", "Cat");
        System.out.println("s = " + s);

        String s2 = "C# is fun, C# is cool"; // replace the second C# with Java
        s2 = s2.replace(" C#", " Java");
/*  we used a space before C# to make it unique so that find and match only the
 second C# in the string, not the first one.  */

        System.out.println("s2 = " + s2);

/* you can also replace a character/letter in a word in the string by using
replace method.  */

        String s3 = "Java";// replace lettrs 'a' with 'e'
        s3 = s3.replace("a", "e");
        System.out.println("s3 = " + s3); // now it will give "Jeve"

        System.out.println("--------- replaceFirst() method--------");
/*  replaceFirst methods replaces only the firs matching one in string
  */

        String result = "Java Java Java";
        result = result.replaceFirst("Java", "Python");
        System.out.println("result = " + result);//Python Java Java

        String result2 = "C# is fun, C# is cool";
        result2 = result2.replaceFirst("C#", "Java");
        System.out.println("result2 = " + result2);

        String result3 = "Java";//replacing one letter
        result3 = result3.replaceFirst("a", "o");//Jova
        System.out.println("result3 = " + result3);

        String result4 = "Java";
        result4 = result4.replaceFirst("va", "ga");//Jaga
        System.out.println("result4 = " + result4);











    }
}

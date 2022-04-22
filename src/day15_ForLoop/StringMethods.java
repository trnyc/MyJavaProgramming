package day15_ForLoop;

public class StringMethods {
    public static void main(String[] args) {
// isEmpty() method gives you true or false. so you can assign it to a boolean

        String str = "";//like this its empty, but if you put a space its not empty
        boolean r = str.isEmpty();
        System.out.println(r);//true

/* isBlank() method checks if there is any character in the string.
space is not a real character like numbers or letters. So isBlank()
gives 'true' for space.
 */
        String str2 = "  ";// when there is spaces its not empty but its blank
        boolean r2 = str.isBlank();
        System.out.println(r2); // true

        System.out.println("----------------------------------------------");

        String s1 = "CYDEO";
        String s2 = "cydeo";

        System.out.println(s1.equals(s2)); //false
        System.out.println(s1.equalsIgnoreCase(s2)); //true
/* equalsIgnoreCase does not check if the string is upper case or lower case
while comparing them.
 */

        String sentence = "My favorite programming language is Java";
        boolean hasCSharp = sentence.contains("C#");// false
        boolean hasJava = sentence.contains("Java");// true
        boolean hasJava2 = sentence.contains("java");// false
        boolean hasJava3 = sentence.toLowerCase().contains("java");//now true

        boolean r3 =  sentence.contains("Java") || sentence.contains("java"); //true

 /* contains() method checks if a portion of a string is included in another string.
 its case senstive. So, to avoid case senstivity, you need to convert your string
 to lowercase first and then use contains() method with lowercase string.
  */
        System.out.println(hasCSharp);
        System.out.println(hasJava);
        System.out.println(hasJava2);
        System.out.println(hasJava3);
        System.out.println(r3);

        System.out.println("--------------------------------------------------------------------");

        String input1 = "I love Java";
        String input2 = "Java";

        System.out.println(input1.equals(input2));//false
        System.out.println(input1.equalsIgnoreCase(input2));//false

        System.out.println(input1.contains(input2));//true

        System.out.println(input1.contains("java"));//false, bacause its case sensitive
/* To avaid case sensitivity problems, you need to convert your string to
UPPERCASE first and check with an uppercase word, OR, convert it to lowercase
ant check with a lowercase word.
 */
        System.out.println(input1.toLowerCase().contains("java"));
        System.out.println(input1.toUpperCase().contains("JAVA"));

        System.out.println("---------------endsWith & startsWith----------------");

        String a = "Wooden Spoon";

        boolean x = a.startsWith("Wo");// true
        boolean y = a.endsWith("on"); // true
 //its case sensitive, so to avoid it, you need to use toUpperCase or toLowerCase

        boolean z = a.toLowerCase().startsWith("woo");
        boolean t = a.toUpperCase().endsWith("OON");

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(t);





    }
}

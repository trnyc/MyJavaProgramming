package day14_String;

public class StringMethod1 {
    public static void main(String[] args) {

/* trim() method is  used to remove white spaces in your codes. White spaces
means, spaces that are not used. Spaces between two words are not white spaces.
trim() method can not modify string but create new one without white spaces.
 */

        String str1 = "        EU 8         ";
        str1 = str1.trim();
        System.out.println(str1);//"EU 8"

        System.out.println("----------------------------------------------");

/*
indexOf() method gives you index number of the character that you want to know
in a string.
 */

        String str2 = "Cydeo School";
        int n1 = str2.indexOf("h");//this will give index of h which is 8.

        System.out.println("n1 = " + n1);

        int n2 = str2.indexOf("ool");//this will give index of first 'o'

        System.out.println("n2 = " + n2);

/* indexOf method gives you index number of the first character that matchs
 in the string. if you want to learn, for ex. index number of second 'o'
 in string, you must make it "unique" by typing other characters next to it.
 */
        String str3 = "Java Programming Language";

        int n3 = str3.indexOf("amm");//to get index of third 'a' in string
        System.out.println("n3 = " + n3);

        int n4 = str3.indexOf("g ");//g and space to get index of second 'g'
        System.out.println("n4 = " + n4);

/* lastIndexOf() method start to read from right side of the string.
So, when you want to learn index of last 'g' in str3, you can use lastIndexOf.
 */
        int n5 = str3.lastIndexOf("g");
        System.out.println("n5 = " + n5);

        System.out.println("-------------------------------------------");

        String s = "Java Nova Cava Wawa orange";
                //  0123456789
        int firstA = s.indexOf("a");
        int lastA = s.lastIndexOf("a");
        int secondA = s.indexOf("a ");
        int thirdA = s.indexOf("a C");//to make it unique you must add more char.
      //int fourthA = s.indexOf("ava W");
      //int fourthA = s.lastIndexOf("av");
        int fourthA = s.indexOf("Ca") +1;//normally it gives index of 'C'
                                        //thats why we added 1 find 'a'
        int fifthA = s.lastIndexOf("a W");
        int sixthA = s.lastIndexOf("aw");
        int seventhA = s.lastIndexOf("a ");

        System.out.println("firstA = " + firstA);
        System.out.println("lastA = " + lastA);
        System.out.println("secondA = " + secondA);
        System.out.println("thirdA = " + thirdA);
        System.out.println("fourthA = " + fourthA);
        System.out.println("fifthA = " + fifthA);
        System.out.println("sixthA = " + sixthA);
        System.out.println("seventhA = " + seventhA);



    }
}

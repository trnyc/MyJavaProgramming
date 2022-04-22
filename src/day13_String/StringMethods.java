package day13_String;

public class StringMethods {
    public static void main(String[] args) {

        String word = "Cydeo";
             //index:  01234

        char thirdChar = word.charAt(2);// index 2 for third character which is 'd'

   //   char tenthChar = word.charAt(9);// there are only 5 character and its range
                                        // is 0-4. So 9 is out of range

//So charAt() gives you the character of the string at given index number

        System.out.println("--------------------------------------------------");

// length() gives you the total character number of given String as int

        String s1 = "Batch 25 is the best batch";
        int totalChars = s1.length();

        System.out.println("totalChars = " + totalChars);// 26

        char lastChar = s1.charAt(totalChars - 1);

        System.out.println("lastChar = " + lastChar);// h

        System.out.println("--------------------------------------------------");

        String str = "wooden spoon";

        str = str.toUpperCase();
        System.out.println(str);

        String s = "JAVA";

        s = s.toLowerCase();//you must assign it back to variable
        System.out.println(s);

        String sentence = "Today is a great day to learn java programming";
        sentence = sentence.toUpperCase();

        System.out.println(sentence);


    }
}

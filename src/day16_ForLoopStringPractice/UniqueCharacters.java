package day16_ForLoopStringPractice;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str = "aaabccc";
        String result = "";
/* Hint: if indexOf() and lastIndexOf() a character in the string is equals,
then it means its a unique character.
 */

        for (int i = 0; i < str.length() ; i++) {
            char ch = str.charAt(i);

            if(str.indexOf(ch) == str.lastIndexOf(ch)){
                result += ch;
            }
        }

        System.out.println(result);// b


    }
}

/*
Write a program that can returns unique (occured one time) character in a string

        Ex:
        input:
            aaabcccd
        output;
            bd
 */
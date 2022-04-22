package day17_While_DoWhile;

public class FrequencyOfChar {
    public static void main(String[] args) {

        String str = "AAABBBCAAAAAAAAA";
        char ch = 'A';
        int frequency = 0;

        for (int i = 0; i < str.length(); i++) {//i: index of str 0-end
            char eachChar = str.charAt(i);//eachChar: each character of str

  /*    OR IF YOU WANT TO START FROM END INDEX INSTEAD OF INDEX '0'
      for (int i = str.length()-1; i >=0; i--) {//i: index of str 0-end
            char eachChar = str.charAt(i);//eachChar: each character of str

   */

            if(ch == eachChar){//if given character matches any of the character in str
                frequency++;

            }
        }
        System.out.println("frequency = " + frequency);

    }
}
/*
1. Write a program that can return the frequency of a char from a String
			Ex:
				str = "AAABBBC"
				ch = 'A'
			Output:
				3
 */
package day21_ForEachLoop;

import java.util.Arrays;

public class Anagram_Piq {
    public static void main(String[] args) {
//Anagram means, the words consist of same characters. (silent <=> listen)

        String str1 = "acdb";
        String str2 = "bdac";

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

//        System.out.println(Arrays.toString(ch1));//[a,c,d,b]
//        System.out.println(Arrays.toString(ch2));//[b,d,c,a]

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        //System.out.println();

//        System.out.println(Arrays.toString(ch1));
//        System.out.println(Arrays.toString(ch2));

        boolean anagram = Arrays.equals(ch1, ch2);

        System.out.println(anagram);



    }
}
/* write a program that can check if two different words are anagram, consist of
same characters or not.
 */
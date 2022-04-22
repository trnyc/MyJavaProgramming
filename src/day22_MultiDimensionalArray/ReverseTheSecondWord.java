package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ReverseTheSecondWord {
    public static void main(String[] args) {

        String sentence = "I love Java";

        String[] words = sentence.split(" ");//[I, love, Java]
                                                //    0   1     2

        String reverse = "";
        for (int i = words[1].length()-1; i >=0 ; i--) {
            reverse += words[1].charAt(i);
            }
  /* starting from last letter of the word, (which is located index(1) of array
  string 'words', reverse it and put back into variable 'reverse' */
        System.out.println(reverse);

          //FIRST SOLUTION
        // sentence = sentence.replaceFirst( words[1], reverse);
            //word[1] is not Array, its an element of Array and its a string

        //SECOND SOLUTION
        words[1] = reverse;
        System.out.println(Arrays.toString(words));

        for (String word : words) { //this is for each loop
            System.out.print(word+" ");
        }




    }
}
/*
2. Write a program that can reverse the second word of the sentence
			Ex:
				sentence = "I Love Java";
			output:
				I evoL Java
 */
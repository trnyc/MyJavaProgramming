package day19_RecapLoopStrings;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "aaabbaacaaadddccee";
        String result = "";

        for (int j = 0; j < str.length(); j++) { //to find frequency of each character

            int count =0;
            char ch = str.charAt(j);

            for (int i = 0; i < str.length(); i++) {

                char each = str.charAt(i);
                if(ch == each){
                    count++;
                }

            }
            if(result.contains(""+ch)){
                continue;//to avoid duplication of characters in the result
            }
            result += ch;//will concatenate each char to result as string in every loop
            result += count; // will add count of each character in every loop

        }
        System.out.println(result);

    }
}
/*
1. Write a program that can find the frequency of the characters from a string
			 Ex:
                        str = "aabcccd";
                        output:
                                a2b1c3d1
 */
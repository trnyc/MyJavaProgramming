package day16_ForLoopStringPractice;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "aabbccbba";
        String result = "";

        //             i <=8 or i<9
        for (int i = 0; i < str.length(); i++) {
            String ch = ""+ str.charAt(i);

            if(!result.contains(ch)){//if 'ch' is not in the 'result'
                result += ch;//add it to 'result' every time
            }
            
        }

        System.out.println(result);


    }
}

/*
Write a program that can remove duplicated characters in a string

        Ex:
            input:  AABBCCBCD
            output: ABCD
 */
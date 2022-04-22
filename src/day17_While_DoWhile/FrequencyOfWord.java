package day17_While_DoWhile;

public class FrequencyOfWord {
    public static void main(String[] args) {

        String str = "JavaJavaJavaJavaJavaJavaJavaJava";
        int frequency = 0;
/*
for loop will check the 'str' if it contains the word 'Java', in every four character.
When it comes to end of string, if it continues to check after last four character,
it will give error because there is no character to check. To avoid this, we must
stop the loop when it checked the last four character. Thats why we put
'i<str.length()-4'  in the loop statement to stop iteration after it checked last
four character.
                    'Java'JavaJavaJavaJavaJavaJavaJava  ==> first check
                       1                         28  32(length) (27  31 index)
                     J'avaJ'avaJavaJavaJavaJavaJavaJava ==> second check
                        2
                                    .
                                    .
                      JavaJavaJavaJavaJavaJavaJava'Java' ==> last check

                      JavaJavaJavaJavaJavaJavaJavaJ'ava? ==> cant check because no
                                                            avaliable 4 chars to check

    */

        for (int i = 0; i <= str.length()-4 ; i++) {
            String eachSub = str.substring(i, i+4);//will check 4 by 4 starting from 0
            //System.out.println(eachSub);
            if(eachSub.equals("Java")){
                frequency++;
            }

        }

        System.out.println("frequency = " + frequency);

    }
}
/*
2. write a program that can return the frequency of the word Java from the sentence
        Ex:
            sentence = "JavaJavaJava";
            output: 3
           	Str = "JavaJava";
           		substrings:
           			1. Java  //substring(0, 4)
           			2. avaJ  //substring(1, 5)
           			3. vaJa  // substring(2, 2+4 )
           			4. aJav  // substring(3, 3+4)
           			5. Java  // substring(4, 4+4)
 */
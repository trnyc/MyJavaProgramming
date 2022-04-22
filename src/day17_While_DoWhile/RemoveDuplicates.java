package day17_While_DoWhile;

public class RemoveDuplicates {
    public static void main(String[] args) {
// Print duplicated characters only once/ remove repeated characters

        String str = "AABBCC";
        String result = "";

        for (int i = 0; i < str.length() ; i++) {
            String ch = ""+ str.charAt(i); // A A B B C C

            if(result.contains(ch)){ //if result already has the character,
                continue; //skip it, dont add one more
            }
                result += ch;// add each character only ones
        }
        System.out.println(result);//ABC
    }
}

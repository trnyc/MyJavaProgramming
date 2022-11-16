package abc_Practice_B28;

public class Test17_remove_duplicates {
    public static void main(String[] args) {

        String str = "xxxxxxxxxxzzzzzzzyyyyyyyyyxxxxxxxzzzzzzz";
                   // 0123
        String result = "";   //"efr"

        for (int i = 0; i < str.length(); i++) { //i: index numbers of str

            char each = str.charAt(i);   // each character of the String str

            if( ! result.contains( ""+ each)  ){ // if the string result does not contain the character of string str yet
                result += each; // then we will add the character to string result
            }
            // if the character is not contained yet in the new string, then we will add it to the new string
            // 1- result = "x"
            // 2- result = "xzy"
        }


        System.out.println(result);

    }
}

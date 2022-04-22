package day24_CustomMethod_Return;

public class ReturnMethodPractice3 {

// HERE IS NOT A MAIN METHOD.. ITS A RETURN METHOD

        public static int frequency(String str, char ch){
            int count = 0;

            for (char each : str.toCharArray() ) {
                if(each == ch){
                    count++;
                }
            }
        return count;
        }


// MAIN METHOD STARTS FROM HERE
    public static void main(String[] args) {

        String str = "aabccdee";//find the unique cahracters

        for (int i = 0; i < str.length(); i++) {

            int frequency = frequency(str, str.charAt(i));

            if(frequency == 1){
                System.out.println(str.charAt(i)); // b d
            }

        }

    }


}

package day21_ForEachLoop;

public class MaxNumber_ {
    public static void main(String[] args) {

        int[] numbers = {10, 5, 4, 20, 1, 0};
        int max = numbers[0];// 20


 /*       for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] > max ){
                max = numbers[i]; // assigning greater number to variable max
            }
        }
  THIS IS WHAT WE DO TO FIND MAX NUMBER BY USING REGULAR FOR LOOP
   */
/*SHORT CUT: TO CREATE A "FOR EACH" LOOP, TYPE THE VARIABLE NAME, (.) AND "FOR" AND 
        PRESS ENTER*/

        for (int number : numbers) {
            if(number > max){
                max = number;
            }
        }

        System.out.println(max);

    }
}

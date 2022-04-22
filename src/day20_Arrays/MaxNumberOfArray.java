package day20_Arrays;

public class MaxNumberOfArray {
    public static void main(String[] args) {

        int[] numbers = {10, 5, 4, 20, 1, 0};
        int max = numbers[0];// 20

/* SHORT CUT: To create a for loop line in arrays, after declaring a array variable,
type your variable on a new line and type a dot(.) and type "fori" and hit enter.
it will automatically type a for loop line. To do it in reverse mode, after
typing your array variable and dot(.), type "forr" and hit enter.
 */

        for (int i = 0; i < numbers.length; i++) {

            if(numbers[i] > max ){
/* it will check every element in the variable one by one and find the max number
and will assign it to variable max. */

                max = numbers[i]; // assigning greater number to variable max
            }

        }

        System.out.println(max);


    }
}

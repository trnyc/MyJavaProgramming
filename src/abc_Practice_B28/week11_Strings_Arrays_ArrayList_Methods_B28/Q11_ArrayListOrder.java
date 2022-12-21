package topicsKahoot.week11_Strings_Arrays_ArrayList_Methods_B28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q11_ArrayListOrder {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(13);
        numbers.add(7);
        numbers.add(18);
        numbers.add(5);
        numbers.add(2);

        System.out.println("Before = " + numbers);//Output - List the elements in the given index. Before = [13, 7, 18, 5, 2]


        Collections.sort(numbers);
        System.out.println("After = " + numbers);//Output - List the elements in the list in an ascending order.After = [2, 5, 7, 13, 18]

        Collections.reverse(numbers);
        System.out.println("Reverse = " + numbers);//Reverse the list of the elements.Reverse = [18, 13, 7, 5, 2]

        Collections.swap(numbers,4,1);
        System.out.println("Swap = " + numbers);//Swap the given indexes. Here 13 replaces with 2 and vice versa. Swap = [18, 2, 7, 5, 13]

        int max = Collections.max(numbers);// Defines and assigns the max num.
        int min = Collections.min(numbers);// Defines and assigns the min num.
        System.out.println("max = " + max);
        System.out.println("min = " + min);


        Collections.replaceAll(numbers, 7, 11);
        System.out.println("ReplacedNumbers = " + numbers);// Replace one element with another assigned value. ReplacedNumbers = [18, 2, 11, 5, 13]

        int frequency = Collections.frequency(numbers, 18 );
        System.out.println("1.frequencyof18 = " + frequency);// Gives the frequency of an element to check the number of the element in the list
        numbers.add(18);
        numbers.add(18);
        System.out.println("numbers = " + numbers);
        frequency= Collections.frequency(numbers,18);
        System.out.println("2.frequencyof18 = " + frequency);


    }

}

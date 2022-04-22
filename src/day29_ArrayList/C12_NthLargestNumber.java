package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class C12_NthLargestNumber {
    public static void main(String[] args) {

/* how to find 'n th' max number without using 'sort' method
THIS IS AN INTERVIEW QUESTION
 */

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7, 7 ,8, 8));

 /*       int max = Collections.max(list);
        System.out.println(max); // 8

        list.removeIf(p-> Collections.max(list) == p);

        This removes the max number from the list, so new max number is 2nd max
        number of original ArrayList. If we repeat the line, new max number also
        will be removed adn we will find 3rd max number of the original arraylist.
        So, you can also create a loop to find nth max number to iterate this
        'removeIf()' method n-1 time. For ex: if you want to find 3rd max number
        you must iterate the loop 2 times.

        max = Collections.max(list);
        System.out.println(max);//7

        list.removeIf(p-> Collections.max(list) == p);
        max = Collections.max(list);
        System.out.println(max);//6     */

        int n = 3;
        for (int i = 1; i < n; i++) {//this loop iterates 2 times
            list.removeIf(p-> Collections.max(list) == p);
        }
        int max = Collections.max(list);
        System.out.println(max); // 6



    }
}

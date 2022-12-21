package abc_Practice_B28.review_arraysList_B28;

import java.util.ArrayList;
import java.util.Arrays;

public class ArewiewQ9 {

    public static void main(String[] args) { // 15

        ArrayList<Integer> arrList = new ArrayList<>();

        arrList.addAll(Arrays.asList(1,2,3,4,5));

        arrList.set(0, arrList.get(4));
        arrList.set(4, arrList.get(0));

        System.out.println(arrList);

        // [5, 2, 3, 4, 5]
    }
}

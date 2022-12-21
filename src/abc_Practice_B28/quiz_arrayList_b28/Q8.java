package abc_Practice_B28.quiz_arrayList_b28;

import java.util.ArrayList;
import java.util.Arrays;

public class Q8 {


    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5));

        list.set(0,list.get(4));
        list.set(4,list.get(0));

        System.out.println(list); //[5, 2, 3, 4, 5]

    }
}

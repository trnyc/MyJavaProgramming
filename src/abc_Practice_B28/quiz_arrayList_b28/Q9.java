package abc_Practice_B28.quiz_arrayList_b28;

import java.util.ArrayList;
import java.util.Arrays;

public class Q9 {

    public static void main(String[] args) {

        ArrayList<Character> list = new ArrayList<>();

        for (char i = 'a'; i <='z'; i++){

            list.add(i);
        }

        boolean r = list.containsAll(Arrays.asList('a', 'c', 'D'));

// there is no print statement
    }
}

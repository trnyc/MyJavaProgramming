package abc_Practice_B28.quiz_arrayList_b28;

import java.util.ArrayList;

public class Q4 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        Integer a = 1;
        list.remove(a);

        System.out.println(list);//[2, 3]


    }
}

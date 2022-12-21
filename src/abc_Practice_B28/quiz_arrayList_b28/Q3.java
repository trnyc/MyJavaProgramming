package abc_Practice_B28.quiz_arrayList_b28;

import java.util.ArrayList;

public class Q3 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        int a = 1;
        list.remove(a);
        System.out.println(list); //[1, 3]
    }

}

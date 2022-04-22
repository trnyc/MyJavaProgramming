package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        //multiply each element by 2

        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) * 2); // get each element and multiply by 2
        }

        System.out.println(list);






    }
}

package abc_Practice_B28.review_arraysList_B28;

import java.util.ArrayList;

public class ArewiewQ7 {

    public static void main(String[] args) {//13

        ArrayList<String> list = new ArrayList<String>();

        list.add("mango");
        list.add("kiwi");
        list.add("grapes");
        list.add("banana");
        list.remove(1);
        list.add("apple");
        list.remove("grapes");

        System.out.println(list);

      //  [mango, banana, apple]

    }
}

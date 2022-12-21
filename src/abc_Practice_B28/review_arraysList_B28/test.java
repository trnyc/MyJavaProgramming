package abc_Practice_B28.review_arraysList_B28;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        System.out.println(list.add("Grapes"));
        System.out.println(list);
        System.out.println(list.remove("Mango"));
        System.out.println(list);
        list.add("Kiwi");
        list.add(3, "Strawberry");
        System.out.println(list.remove(2));
        System.out.println(list);

    }
}

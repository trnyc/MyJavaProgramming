package abc_Practice_B28.review_arraysList_B28;

import java.util.ArrayList;
import java.util.List;

public class ArewiewQ4 {

    public static void main(String[] args) {//10

        List<String> list = new ArrayList<String>();

        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes"); // apple banana strawberry kiwi
        list.remove("Mango");
        list.add("Kiwi");
        list.add(3, "Strawberry");
        list.remove(2);


        System.out.println(list); // [Apple, Banana, Strawberry, Kiwi]

    }
}

package abc_Practice_B28.review_arraysList_B28;

import java.util.ArrayList;
import java.util.Arrays;

public class ArewiewQ11 {

    public static void main(String[] args) { // 17

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4));

        list.remove(Integer.parseInt("2"));

        System.out.println(list);                  // [1, 2, 4]








//        ArrayList<String> color_list = new ArrayList<>();
//
//        // use add() method to add values in the list
//        color_list.add("White");
//        color_list.add("Black");
//        color_list.add("Red");
//        color_list.add("White");
//        color_list.add("Yellow");
//        color_list.add("White");
//
//        System.out.println("List of Colors");
//        System.out.println(color_list);
//
//        // Remove all White colors from color_list
//        color_list.removeIf(p -> p.equals("White"));
//
//        System.out.println("Color list, after removing White colors :");
//        System.out.println(color_list);

    }
}

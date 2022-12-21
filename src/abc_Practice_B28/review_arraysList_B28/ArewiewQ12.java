package abc_Practice_B28.review_arraysList_B28;

import java.util.ArrayList;

public class ArewiewQ12 {

    public static void main(String[] args) { // 18

        ArrayList<String> list = new ArrayList<String>();

        list.add("Medina"); // 0
        list.add(2,"Erhan");
        list.add(1,"Hakan");

        System.out.println(list);   // Index: 2, Size: 1  so index out of bound
                                    // it will work if you add index 1 first, you can not jump index
    }
}

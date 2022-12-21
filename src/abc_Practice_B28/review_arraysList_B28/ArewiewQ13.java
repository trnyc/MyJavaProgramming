package abc_Practice_B28.review_arraysList_B28;

import java.util.ArrayList;

public class ArewiewQ13 {

    public static void main(String[] args) { // 19

        ArrayList<String> names = new ArrayList<String>();

        names.add("Enes");//0
        names.add("Akobir");//1
        names.add(1,"Alex");
        names.add(0,"Alp");

        System.out.println(names);   // [Alp, Enes, Alex, Akobir]


    }
}

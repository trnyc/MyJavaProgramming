package abc_Practice_B28.quiz_arrayList_b28;

import java.util.ArrayList;

public class Q5 {


    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();

        colors.add("green");
        colors.add("red");
        colors.add("blue");
        colors.add("yellow");
        colors.add(3,"cyan");

        System.out.println(colors);   //[green, red, blue, cyan, yellow]
    }
}

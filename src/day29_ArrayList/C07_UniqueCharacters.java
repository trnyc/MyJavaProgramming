package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class C07_UniqueCharacters {
    public static void main(String[] args) {

        String str = "aaabcccdeeef";

        String[] arr = str.split(""); // split() method converts string into an Array

        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));

        System.out.println("list = " + list);

// find unique chars

        String unique = "";
        for (String each : list) {
            int frequency = Collections.frequency(list, each);
            if(frequency == 1){
                unique += each;
            }
        }
        System.out.println("unique = " + unique);//bdf,


    }
}

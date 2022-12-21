package abc_Practice_B28.review_arraysList_B28;

import java.util.ArrayList;
import java.util.Arrays;

public class ArewiewQ8 {

    public static void main(String[] args) {//14

        ArrayList<Integer> list = new ArrayList<Integer>();

        list.addAll(Arrays.asList(1,2,3,4,5,6,7));

        for (int each:list){

            if (each % 2 != 0)
                continue;

            System.out.print(each+" ");
        }

        // 2 4 6
    }
}

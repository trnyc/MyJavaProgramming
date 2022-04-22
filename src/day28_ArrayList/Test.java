package day28_ArrayList;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        //insert 33 to index 2
        int[] array = {1, 2, 3, 4, 5, 6};

        int x = 33;

        int[] result = new int[array.length+1];
        int j = 0;

        for (int i = 0; i < array.length; i++) {

           if(j==2){
               result[j++] = x;
               i--;
               continue;
           }
            result[j++] = array[i];

        }


        System.out.println("result = " + Arrays.toString(result));


    }
}

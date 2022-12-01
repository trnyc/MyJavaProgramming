package abc_Practice_B28;




import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TestTest {


    public static void main(String args[])
    {
        int [][] arr = new int [][]{{1,2}, {3,4}};
        arr [1] = arr[0];
        System.out.println(arr[1]);

        System.out.println(Arrays.deepToString(arr));

        int [] arr2 = {1, 2, 3};

       int a = arr2.length;
        System.out.println(arr2[2]);


        System.out.println(Arrays.toString(arr2));



    }

}


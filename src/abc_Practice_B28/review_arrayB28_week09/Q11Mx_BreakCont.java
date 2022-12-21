package abc_Practice_B28.review_arrayB28_week09;

import java.util.Scanner;

public class Q11Mx_BreakCont {
    public static void main(String[] args) {

        for (int i = 1; i <=10 ; i++) {
            if(i%2==0)
                continue;
            System.out.println(i + "");  //Output = 1, 3 , 5, 7 ,9

        }
       Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("enter a number between 1 and 10: ");
            int n = s.nextInt();
            if (n < 1 || n > 10)
                continue;
            //System.out.println("hello");
            break;

        }




    }
}

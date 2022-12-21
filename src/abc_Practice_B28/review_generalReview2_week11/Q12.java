package abc_Practice_B28.review_generalReview2_week11;

public class Q12 {
    public static void main(String[] args) {

        int x = 0;
        int y = 2;

        while ( (y !=0) && (x / y) >= 0) {
            x = x + 1; // 2
            y = y - 1; // 0
        }

        System.out.println("x = " + x);
        System.out.println("y = " + y);

    } /*
      x = 2
      y = 0
           */
}

package abc_Practice_B28.review_generalReview2_week11;

public class Q14 {
    public static void main(String[] args) {

        String shirts[][] = new String [2][2];
                shirts [0][0] = "red";
                shirts [0][1] = "blue";
                shirts [1][0] = "small";
                shirts [1][1] = "medium";

                /* Line 1 */

        for (int i = 0; i < 2; ) {
            for (int j = 0; j < 2; ) {
                System.out.println(shirts [i][j]);
                j++;
            }
            i++;
        }

    }
}

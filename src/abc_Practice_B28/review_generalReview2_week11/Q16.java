package abc_Practice_B28.review_generalReview2_week11;

public class Q16 {
    public static void main(String[] args) {

        int [][] arr=  {{1,2},{3,4}};

        for (int i = arr.length-1; i >=0 ; i--) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j] + "  ");

            }
            // output = 3 4 1 2
        }

    }
}

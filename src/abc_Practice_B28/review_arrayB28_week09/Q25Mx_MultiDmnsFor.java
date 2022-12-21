package abc_Practice_B28.review_arrayB28_week09;

public class Q25Mx_MultiDmnsFor {
    public static void main(String[] args){ //slide 26 question 25

        int[][] arr = {{1,2,3}, {3,4}};

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++){
                System.out.print(arr[i][j] + " ");
            }
        }
// Output = 1 2 3 4
    }
}

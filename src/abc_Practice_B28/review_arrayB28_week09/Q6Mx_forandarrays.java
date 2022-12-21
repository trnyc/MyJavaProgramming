package abc_Practice_B28.review_arrayB28_week09;

public class Q6Mx_forandarrays {
    public static void main(String[] args) {
//Slide7 - 14  Question 6

        int array1[] = {1, 2, 3};
        int array2[] = new int[5];

        array2 = array1; // 1 2 3  1 2 3

        for (int i : array2) {
            System.out.println(i); // 1 2 3
        }
        System.out.println();
        int array3[] = new int[3];
        array3 = array2; // arr3 1 2 3

        for (int i : array3) {
            System.out.println(i);

        }

// Output =  1 2 3    1 2 3
    } }

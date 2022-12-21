package abc_Practice_B28.review_arrayB28_week09;

public class Q16Mx_ABCDContCont { // Slide 17 Question 16
    public static void main(String[] args) {

        String[] arr = {"A", "B", "C", "D"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
            if (arr[i].equals("A")) {
                continue;
            }
            System.out.println("Work Done");
            continue;
        }
} }
/*Output=
A
B
Work Done
C
Work Done
D
Work Done */

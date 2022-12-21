package abc_Practice_B28.review_arrayB28_week09;

public class Q15Mx_ABCDContBrk {
    public static void main(String[] args) {//  Slide 16   Question 15

        String[] arr = {"A", "B", "C", "D"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
            if (arr[i].equals("A")) {
                continue;
            }
            System.out.println("Work Done");
            break;
        }
} }
/* Output =  A
 B
Work Done  */

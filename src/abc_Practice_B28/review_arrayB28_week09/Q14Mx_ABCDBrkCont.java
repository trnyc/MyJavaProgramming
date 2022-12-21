package abc_Practice_B28.review_arrayB28_week09;

public class Q14Mx_ABCDBrkCont {
    public static void main(String[] args) {//  Slide 15   Question 14

        String[] arr = {"A", "B", "C", "D"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
            if (arr[i].equals("A")) {
                break;
            }
            System.out.println("Work Done");
            continue;
    }
} }
// Output = A
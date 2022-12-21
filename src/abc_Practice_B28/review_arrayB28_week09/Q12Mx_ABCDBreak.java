package abc_Practice_B28.review_arrayB28_week09;

public class Q12Mx_ABCDBreak { // Slide 13 Question 12
    public static void main(String[] args) {

        String[] arr = {"A", "B", "C", "D"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
            if (arr[i].equals("C")) {
                continue;
            }
            System.out.println("Work Done");
            break;
        }
      }   // Output =   A    Work Done



}
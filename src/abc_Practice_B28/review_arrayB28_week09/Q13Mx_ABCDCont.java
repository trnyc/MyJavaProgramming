package abc_Practice_B28.review_arrayB28_week09;

public class Q13Mx_ABCDCont {
    public static void main(String[] args) {// Slide 14 Question 13

            String[] arr = {"A", "B", "C", "D"};
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i] + " ");
                if (arr[i].equals("C")) {
                    continue;
                }
                System.out.println("Work Done");
                continue;
            }
        }
        /*
        Output =A
    Work Done
    B
    Work Done
    C
            D
    Work Done
*/


    }


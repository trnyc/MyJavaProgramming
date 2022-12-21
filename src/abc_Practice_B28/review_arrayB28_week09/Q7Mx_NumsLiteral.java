package abc_Practice_B28.review_arrayB28_week09;

public class Q7Mx_NumsLiteral {
    public static void main(String[] args) { //slide 8 - 15 question 7

        int[] num1 = new int[3];
        int[] num2 = {1, 2, 3, 4, 5};
        num1 = num2;

        for (int i = 0; i < num1.length; i++) {
            System.out.print(num1[i]);  // Output= 12345
        }
    }

}

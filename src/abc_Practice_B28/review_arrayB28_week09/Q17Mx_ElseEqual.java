package abc_Practice_B28.review_arrayB28_week09;

public class Q17Mx_ElseEqual {// Slide 18 Question 17

    public static void main(String[] args) {

        int data [] = {2010,2013,2014,2015,2014};
        int key= 2014;
        int count=0;
        for (int e : data){
            if (e !=key) {
                count++;
            }
        }
        System.out.println(count + " Found");  // 3 Found
    }
}

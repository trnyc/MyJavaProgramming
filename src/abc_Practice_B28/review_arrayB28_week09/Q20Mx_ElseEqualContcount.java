package abc_Practice_B28.review_arrayB28_week09;

public class Q20Mx_ElseEqualContcount {// Slide 21 Question 20
    public static void main(String[] args) {

        int data [] = {2010,2013,2014,2015,2014};
        int key= 2014;
        int count = 0;
        for (int e : data){
            if (e !=key) {
                continue;   // Output = Compilation Fails
                //count++;
            }
        }
        System.out.println(count + " Found");
    }}

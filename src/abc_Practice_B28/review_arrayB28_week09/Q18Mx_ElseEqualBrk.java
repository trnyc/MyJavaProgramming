package topicsKahoot.arrayB28_week09;

public class Q18Mx_ElseEqualBrk {
    public static void main(String[] args) {  // Slide 19 Question 18

        int data [] = {2010,2013,2014,2015,2014};
        int key= 2014;
        int count=0;
        for (int e : data){
            if (e != key) {
                count++;
                break;
            }
        }
        System.out.println(count + " Found");  // Output = 1 Found
    }}

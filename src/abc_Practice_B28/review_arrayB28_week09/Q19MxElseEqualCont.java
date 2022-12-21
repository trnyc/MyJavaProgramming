package abc_Practice_B28.review_arrayB28_week09;

public class Q19MxElseEqualCont {
    public static void main(String[] args) { // Slide 10 Question 19


    int data [] = {2010,2013,2014,2015,2014};
    int key= 2014;
    int count=0;

    for (int e : data){
        if (e !=key) {
            continue;

        }

    }
    System.out.println(count + " Found");  // 0 Found
    count++;


    }}

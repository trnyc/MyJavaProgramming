package abc_Practice_B28.review_generalReview2_week11;

public class Q3 {
    public static void main(String[] args) {


        int a = 50;
        int res = --a + a++ + a-- + a++;
//                49     49   50     49 = 197
        System.out.println("res = " + res);  // res = 197
        System.out.println("a = " + a); // a = 50




    }


}








//        int b = 1;
//        int res1 = -b-- + b++ / -b-- * --b;
////                 -1     0     -1     -1
//
//
//        System.out.println("res1 = " + res1);  // -1
//        System.out.println("b = " + b); // -1
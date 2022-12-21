package abc_Practice_B28.review_generalReview2_week11;

public class Q9 {
    public static void main(String[] args) {

        method2();
        method1();
        method3();
        method2();

    }

    public static void method2() {
        method1();
        System.out.println("I am method 2.");
    }

    public static void method3(){
        method2();
        System.out.println("I am method 3.");
        method1();
    }

    public static void method1(){
        System.out.println("I am method 1.");
    }

/*  OUTPUT
I am method 1.
I am method 2.
I am method 1.
I am method 1.
I am method 2.
I am method 3.
I am method 1.
I am method 1.
I am method 2.
*/



}

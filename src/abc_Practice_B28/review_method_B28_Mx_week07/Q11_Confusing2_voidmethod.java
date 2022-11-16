package abc_Practice_B28.review_method_B28_Mx_week07;

public class Q11_Confusing2_voidmethod {
    // Original Name of Class= public class Confusing
    public static void main(String[] args) {
        method1();
        method3();
        method2();
        method3();

    }

    public static void method2() {
        method1();
        System.out.println("I am method 2.");
    }

    public static void method3() {
        method1();
        method2();
        System.out.println("I am method 3.");

    }

    public static void method1() {

        System.out.println("I am method 1.");
    }

}
/*
Output=I am method 1.
I am method 1.
I am method 1.
I am method 2.
I am method 3.
I am method 1.
I am method 2.
I am method 1.
I am method 1.
I am method 2.
I am method 3.

 */
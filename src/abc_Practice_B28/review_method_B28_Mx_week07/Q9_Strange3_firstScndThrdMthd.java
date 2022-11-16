package abc_Practice_B28.review_method_B28_Mx_week07;

public class Q9_Strange3_firstScndThrdMthd {


    public static void main(String[] args) {
        second();
        first();
        second();
        third();
    }

    public static void first() {
        System.out.println("Inside first method.");
    }

    public static void second() {
        System.out.println("Inside second method.");
        first();
    }

    public static void third() {
        System.out.println("Inside third method.");
        first();
        second();
    }


}
/*
Output=
Inside second method.
Inside first method.
Inside first method.
Inside second method.
Inside first method.
Inside third method.
Inside first method.
Inside second method.
Inside first method.
 */
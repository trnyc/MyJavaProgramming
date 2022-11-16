package abc_Practice_B28.review_method_B28_Mx_week07;

public class Q8_Strange2_firstScndThrdMthd {
    // Original class name=  public class Strange {
    public static void main(String[] args) {
        first();
        third();
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
        first();
        second();
        System.out.println("Inside third method.");

    }


}
/*
Output=
Inside first method.
Inside first method.
Inside second method.
Inside first method.
Inside third method.
Inside second method.
Inside first method.
Inside first method.
Inside second method.
Inside first method.
Inside third method.
 */
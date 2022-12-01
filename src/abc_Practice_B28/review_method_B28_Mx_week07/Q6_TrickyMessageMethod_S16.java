package abc_Practice_B28.review_method_B28_Mx_week07;

public class Q6_TrickyMessageMethod_S16 {
    public static void main(String[] args) {
        message1();
        message2();
        System.out.println("Done with main.");
    }


    public static void message1() {
        System.out.println("This is message1.");
    }

    public  static void message2() {
        System.out.println("This is message2.");
        message1();
        System.out.println("Done with message2.");
    }
}

/*
Output= This is message1.
This is message2.
This is message1.
Done with message2.
Done with main.
 */
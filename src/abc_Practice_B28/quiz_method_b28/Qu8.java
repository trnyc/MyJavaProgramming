package abc_Practice_B28.quiz_method_b28;

public class Qu8 {

    public static void main(String[] args) {

        dosum(10, 20);
        dosum(10.0, 20.0);

    }
    public static void dosum(double x, double y) {

        System.out.println("double sum is " + (x + y));

    }

    public static void dosum(float x, float y) {
        System.out.println("float sum is " + (x + y));
    }

    public static void dosum(int x, int y) {
        System.out.println("int sum is " + (x + y));
    }
}

package quizzes_B_28.customMethods;

public class Q8_dosum {
    public static void main(String[] args) {
        dosum(10, 20);
        dosum(10.0, 20.0);
    }

        public static void dosum(double x, double y) {
            System.out.println("double sum is " + (x+y));
        }


        public static void dosum(float x, float y) {
            System.out.println("float sum is " + (x+y));
        }


        public static void dosum(int x, int y){
        System.out.println("int sum is "+ (x+y));
        }

// output= int sum is 30
    // double sum is 30.0

}

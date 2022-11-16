package abc_Practice_B28.review_method_B28_Mx_week07;

public class Q13_doSumMethod {
   // Original class name= public class SumTest

    public static void doSum(Integer x, Integer y){ // question 13
        System.out.println("Integer sum is " + (x+y));
    }

    public static void doSum(double x, double y){
        System.out.println("double sum is " + (x + y));
    }

    public static void doSum(float x, float y){
        System.out.println("float sum is " + (x + y));
    }

    public static void  doSum(int x, int y){
        System.out.println("int sum is " + (x + y));
    }

    public static void main(String[] args) {
        doSum(10, 20); // output=int sum is 30
        doSum(10.0, 20.0); //output= double sum is 30.0
    }


}

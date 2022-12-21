package topicsKahoot.week11_Strings_Arrays_ArrayList_Methods_B28;

public class Q14_MethodSignature {

    public static void main(String[] args) {

        int x = 6;
        int y= 3;
        int z= 12;


        int w = method1(x,y,z);
        System.out.println("w = " + w); // Output w= 6

        int Test1= method1(z,x,y);
        System.out.println("Test1 = " + Test1); // Test1=1
        int Test2= method1(y,z,x);
        System.out.println("Test2 = " + Test2);// Test2= 24

        int a= 18;
        int b= 9;
        int c= 36;
        int Test3= method1(a,b,c);

        System.out.println("Test3 = " + Test3);// Test3=18

        int Test4= method1(3,9,6); // Test4= 18
        System.out.println("Test4 = " + Test4);
    }

    public static int method1(int y, int z, int x) {
        return (x*z)/y;

    }



}

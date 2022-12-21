package abc_Practice_B28.kahoot_review_week11;

public class Q14 {

    public static void main(String[] args) {

        int a = 6;
        int b = 3;
        int c = 12;

                   //  6   3  12
        int w = method1(a, b, c);
        System.out.println(w);     // 6

    }
//                             x 6    y 3  z 12
    public static int method1(int y,int z,int x) {

        return (x * z) / y ;
        //      12 * 3  /6 = 6

    }
}

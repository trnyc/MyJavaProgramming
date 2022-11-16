package day01_JavaIntro;

public class Test3 {

    public static void main(String[] args) {

        int a = 11;

        int b = a++ + ++a;
        //      11     13 = 24

        System.out.println(b); //24

        System.out.println("--------------------------------------------------------");

        int x = 11, y = 22, z;

        z = x + y + x++ + y++ + ++x + ++y;
        //  11  22   11   22     13    24 = 103


        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

        System.out.println("-------------------------------------------------------");

        int k = 0;

        k = k++ - --k + ++k - k--;
         //  0     0     1     1 = 0


        System.out.println(k);



    }
}

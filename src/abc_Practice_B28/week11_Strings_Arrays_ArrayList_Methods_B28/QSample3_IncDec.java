package abc_Practice_B28.week11_Strings_Arrays_ArrayList_Methods_B28;

public class QSample3_IncDec {
    public static void main(String[] args) {
        int a = 50;
        int res= --a +  a++ + a-- + a++;

        System.out.println("res = " + res);  // res= 197
        System.out.println("a = " + a); // a= 50

        int b= 1;
        int res1=  -b--   + b++ /  -b--  *  --b;

        System.out.println("res1 = " + res1);  // -1
        System.out.println("b = " + b); // 1


    }


}

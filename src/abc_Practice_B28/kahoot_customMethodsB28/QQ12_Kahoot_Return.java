package abc_Practice_B28.kahoot_customMethodsB28;

public class QQ12_Kahoot_Return {


    public static int sum(int a, int b) {

    if(a+b>1)
        return 0;
        System.out.print(a+b);// 1  0
    return a+b;
    }

    public static void main(String[] args) {

        System.out.println(sum(1,sum(0,1)));
    }//                            1         1

// output= 1 0
    // return exit the method
}

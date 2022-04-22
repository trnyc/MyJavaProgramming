package day06_PrimitiveTypeCastings;

public class ArithmaticOperators {
    public static void main(String[] args) {
/*
ARITHMETIC OPERATORS ARE:
    Addition (+): Adds two values
    Substraction (-): subtructs one value from another
    Multiplication (*): multiplies two values
    Division (/): divides two values
    Modulus (Remainder) %: divides two values and returns remainder
 */
        System.out.println("12" + 1); //this isnt calculation. this gives you 121

        System.out.println(100 + 25);//addition 125
        System.out.println(100 - 25);//substraction 75
        System.out.println(10 * 6);//multiplication 60

/*in java, division (/) operator works different than mathematic
in math: 10/4 = 2.5
in java: 10/4 = 2 (because java see this numbers as int by default
            to get the correct result you must use decimal number at least one of them
            or you must put a D or d near your number
 */
        System.out.println(10/4); //this gives 2 instead of 2.5
        System.out.println(10.0/4); //either use decimal or use d or D with one number
        System.out.println(10/4.0);
        System.out.println(10/4d);
        System.out.println(10D/4);

        int a = 100;
        double b = a/6; //this gives 16 not 16.66666
        double c = a/7.0; //this gives 14.28....
        double d = a/9d; //this gives 11.1111...
        double e = (double)a/11; //this gives 9.0909....

        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);



    }
}

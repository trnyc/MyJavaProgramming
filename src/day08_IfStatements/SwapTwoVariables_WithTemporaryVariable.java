package day08_IfStatements;

public class SwapTwoVariables_WithTemporaryVariable {
    public static void main(String[] args) {

        int a = 10;
        int b = 15;
/*
a'nın değerini b'ye, b'nin değerini a'ya atayacağız ancak 'b = a' komutunu girdiğimizde
b=10 olur ve b'nin orjinal değeri olan 15 silinir. bu nedenle geçici bir c değeri oluturup
b'nin değerini geçici olara c'ye atayıp ordan tekrar a'ya atayacağız.
Sonucunda a=15, b=10 olmalı.
 */
        int c = b;//b'nin değeri kaybolmadan önce c'ye atadık
        b = a;// now b=10
        a = c; //and a=15

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
/* Write a program that can swipe (exchange) two variabeles' value by using a temporary variable
        Ex:
            if a=10, b=15
 */
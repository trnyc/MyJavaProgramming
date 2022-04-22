package day18_NestedLoop;

public class DivideTwoNumbersPIQ {
    public static void main(String[] args) {
/* Write a program that can divide two positive numbers without using
division(/), multiplication(*) operators or remainder(%) operators  */

       int a =100;
        int b = 7;
        int count = 0;
        while (a >= b){
            a -= b;
            count++;
        }
        System.out.println("count = " + count);//count = 14
        System.out.println("a = " + a);// a=2 which is also remainder




    }
}

package day07_Operators;

public class ArithmeticOperators {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 3;

        int division = num1/num2;
        int remainder = num1%num2;
//print =>10 divide by 3 is equal to 3 with a remainder of 1

        System.out.println(num1 + " divide by " + num2 + " is equal to " + division
        + " with a remainder of " + remainder);

// in java % (modulus) operator gives the number of remainder/leftover of a division
        //bölme işleminin kalanını verir

        // what is the remainder 25 divided by 4
        System.out.println(25 % 4);

        // what is the remainder of 25 divided by 5
        System.out.println(25 % 5);
    }
}

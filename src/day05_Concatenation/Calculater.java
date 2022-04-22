package day05_Concatenation;

public class Calculater {

    public static void main(String[] args) {

        int firstNumber = 100;
        int secontNumber = 50;

        int addition = firstNumber + secontNumber;
        int substraction = firstNumber - secontNumber;

//print 100 + 50 = 150
        System.out.println(firstNumber + " + " + secontNumber + " = " + (firstNumber + secontNumber));

        // or
        System.out.println(firstNumber + " + " + secontNumber + " = " + (addition));

// print 100 - 50 = 50
        System.out.println(firstNumber + " - " + secontNumber + " = " + (substraction));

    }
}

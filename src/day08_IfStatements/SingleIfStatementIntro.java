package day08_IfStatements;

public class SingleIfStatementIntro {
    public static void main(String[] args) {

        int number = 200;
        boolean evenNumber = number %2 == 0;//2'ye bölünüyorsa çift sayıdır
        boolean oddNumber = !evenNumber; //not even number

        if(evenNumber) {  //if 'evenNumber' is true 'println' code will run, otherwise no.
            System.out.println(number + " is even number");
        }

        if(oddNumber) { //false. and when its false this code will not be run or print
            System.out.println(number + " is odd number");
        }

// PRINT THREE DIFFERENT STATEMENT ABOUT THE NUMBER 300, IS IT POSITIVE, NEGATIVE OR ZERO

        int n = 300;

        if (n > 0) { //if n greater than zero, then its positive
            System.out.println(n + " is positive");
        }
        if (n < 0) { //if n less than zero, then its negative
            System.out.println(n + " is negative");
        }
        if (n == 0) { //if n equal to zero, its true and will print, otherwise NOT.
            System.out.println(n + " is zero");
        }



    }
}

package day09_IfStatements;

public class MedianNumber {
    public static void main(String[] args) {

        int a = 10, b = 15, c = 20;/* a, b, and c MUST BE different numbers
IF there are three different numbers, one must be max, one must be min and
one must be median(ortanca)
DONT FORGET: numbers can be chage.so consider possibilities for each number */

        boolean aIsMedian = (b < a && a < c) || (c < a && a < b);
        boolean bIsMedian = (b > a && b < c) || (b < a && b > c);
        boolean cIsMedian = !aIsMedian && !bIsMedian;
//OR    boolean cIsMedian = (c > a && c < b) || (c < a && c > b);

        if(aIsMedian) { //if  a is the median number
            System.out.println(a + " a is median");
        }

        if(bIsMedian) {//if b is the medan number
            System.out.println(b + " b is median");
        }

        if(cIsMedian) {//if c is the medan number
            System.out.println(c + " c is median");
        }
//ONLY TRUE IF STATEMENT WILL BE PRINTED
    }
}

/*  2. Create a class called MedianNumber. write a program that can find
the median number between three DIFFERENT given integers
Ex:
a = 10, b= 15, c = 20;

Output:
15 is the median number
Posibility #1: a could be median number
Posibility #2: b could be median number
Posibility #3: c could be median number
 */
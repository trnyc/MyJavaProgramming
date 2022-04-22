package day42_Exceptions;

public class DisadvantageOfThrowsKeyword {
    public static void main(String[] args) {

/*
**********If you use 'throws' keyword in a method to handle an exception, whenever you call this method
to use in another class, yuo must deal this exception again.
* But if you use try&catch blok in your method, you dont need to do that.

* DONT FORGET==> try&catch block is PERMANENT solution, but 'throws' keyword is not
* SO ==> If you are handling an exception in a method and you will use it in another class
   you must use try&catch block.
 */

        System.out.println("Hello");
        //sleep(1.5); // this method used 'throws' keyword and gives error
        System.out.println("Hello World");

        System.out.println("-----------------------------------------------------------");

        System.out.println("Hello");
        MorningWorkOut.sleep(1.5);// this method used try&catch block and gives no error
        System.out.println("Cydeo");





    }// End of main method



public static void sleep(double seconds) throws InterruptedException {
        Thread.sleep((long)(seconds*1000));
}





}

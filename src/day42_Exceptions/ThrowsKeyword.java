package day42_Exceptions;

public class ThrowsKeyword {
    public static void main(String[] args) throws InterruptedException{

 /*
 Instead of using multiple try&catch blocks, you may use 'throws' keyword together with name of
 exception class stetement is possible and easier way to handle the exceptions. You must use
 'throws' keyword just after main method pharentese. You can learn name of exception class
 statement by howering over error line. There is also a shortcut to do this

  */

        System.out.println("-------------------------Test 1 --------------------------");

        System.out.println("Hello");
        Thread.sleep(3000);
        System.out.println("Cydeo");

        System.out.println("-------------------------Test 1 completed-------------------------");




        System.out.println("-------------------------Test 2 --------------------------");

        System.out.println("Hello");
        Thread.sleep(3000);
        System.out.println("EU 8");

        System.out.println("-------------------------Test 2 completed-------------------------");




    }
}

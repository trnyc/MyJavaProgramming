package day23_CustomMethods_VoidMethod;

public class CustomMethodPractice {
    public static void main(String[] args) {

        helloWorld5Times();

        System.out.println("------------------------------");

        helloCydeo5Times();

        System.out.println("------------------------------");

        evenNumbers();

    }


    // create a function that can print hello world 5 times ==> helloWorld5Times()
    public static void helloWorld5Times(){

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World!");
        }

    }

    /* you can create a method and use/exucute it inside main method anywhere
    and any time, instead of for ex: using for loop several times.
    *Give a meaningful name to your method in order to remember what is inside
      and what is it for.
    **SHHORTCUT: If you want to find your body of method in your codes,
    type neme of your method, move your mouse on the name and
    while you hold the Ctrl click on name of method.

     */


    // create a function that can print hello Cydeo 5 times  ==> helloCydeo5Times
    public static void helloCydeo5Times(){

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Cydeo!");
        }

    }


    // create a function that can print all the even numbers from 1 ~ 10 ==> evenNumbers
    public static void evenNumbers(){

        for (int i = 2; i < 11 ; i+=2) {
            System.out.println(i);
        }

    }



}
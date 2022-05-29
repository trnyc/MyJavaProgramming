package day41_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlocks {
    public static void main(String[] args) {

//try & catch block is used to handle 'unchecked exceptions'

        System.out.println("Test1 Started");

        try{

            System.out.println( 9/0 );

        }catch (ArithmeticException e) { // e can be any name, 'ArithmeticException' is a class name that we use here

            System.out.println("Catch Block");

            System.out.println("Arithmetic Exception was occurred");


        }
        System.out.println("Test Completed");

        System.out.println("------------------------------------------------------------------------------");


        System.out.println("Test2 started");

        int[] numbers = {1, 2, 3, 4, 5};

        try {

            System.out.println(numbers[200]); // there is no index 200
            System.out.println("Try Block");

       // }catch (NullPointerException b){ // its important to know which exception class to be used
// if you dont know which class to be used, you can use 'RuntimeException' which is parent of all unchecked exception classes
        }catch (RuntimeException b){

//            System.out.println("Catch Block");
//
//            System.out.println("Run time  Exception was occurred");

            b.printStackTrace();// gives full description of exceptions. used in catch block
                    // -- OR --
            //b.getMessage();
        }

        System.out.println("Test2 Completed");


        System.out.println("-------------------------------------------------------------------------");


        System.out.println("Test3 Started");


        try {
            System.out.println("Cydeo".substring(2, 0));
        }catch (RuntimeException e){
            e.printStackTrace(); // give detailed description of exceptions
        }
/* 'RuntimeException' class is parent class of all unchecked exceptions. So you can use 'RuntimeException'
to handle all unchecked exceptions.
 */
        System.out.println("Test3 completed");


        System.out.println("--------------------- checked exceptions -----------------------------------------");

        System.out.println("Hello");

        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){ // 'e' is a created object and can be any name,
            e.printStackTrace();
        }

        System.out.println("Cydeo");
 // there is also a shortcut to handle a checked exception in intelliJ. Just click on the error.


        System.out.println("__________--------------______________----------------____________");


        try {
            FileInputStream fle = new FileInputStream("File Path");
        } catch (FileNotFoundException e) {

        }


    }
}

/*
If exception occurred in 'try' block (during run time, not compile time), try block will not be executed,
it will jump to catch block.

** .printStackTrace()  and  .getMessage() are two popular methods that are used description of exceptions
int catch block.

====> .printStackTrace() : gives the full description of exception
====> .getMessage() : gives brief description of exception

 */
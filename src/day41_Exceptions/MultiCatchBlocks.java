package day41_Exceptions;

import day39_Recap.cydeoTask.Employee;

public class MultiCatchBlocks {
    public static void main(String[] args) {


        Employee employee = null;

        try {
            System.out.println(employee.getSalary()); // NullPointerException occurs

        }catch (NullPointerException e){
            System.out.println("First catch block");
            e.printStackTrace();

        }catch (IndexOutOfBoundsException e){
            System.out.println("Second catch block");
            e.printStackTrace();

        }catch (ArithmeticException e){
            System.out.println("Third catch block");
            e.printStackTrace();

        }catch (ClassCastException e){
            System.out.println("Forth catch block");
            e.printStackTrace();

        }catch (RuntimeException e){ // incase you cant catch the exception in previous blocks, RuntimeException is an insurance to catch it
            System.out.println("Fifth catch block");
            e.printStackTrace();
        }

        System.out.println("Test Completed");

/*  -If you can not catch the exception by using correct exception class, your test never be completed
    -Which catch block catch the exception, only it will be executed.
    -There are more than 50 unchecked exceptions, to avoid all the possibilities to be checked on running,
       you cen put some possible unchecked exceptions in the catch blocks and 'RuntimeException' to the
       last block.
    -In the blocks, you can never place parent class (e.g. RuntimeException) before a child exception class
           */

        System.out.println("----------------------------------------------------------------------");

        try{
            System.out.println("Java".charAt(-1));
        }catch (RuntimeException e){
            e.printStackTrace();
        }


    }
}

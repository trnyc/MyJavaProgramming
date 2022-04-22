package day42_Exceptions;

public class ThrowsKeyword2 {
    public static void main(String[] args) throws ArithmeticException{

        System.out.println("----------------test started----------------");

        System.out.println(9/0); // unchecked exception

        System.out.println("--------------test copleted------------------");

/*  yuo can not handle 'unchecked exceptions' by using throws kewword. Even if you use it
it still gives error during run time.
SO 'try&catch block' is only way to handle unchecked exceptions
AND 'throws' keyword can be used only for checked exceptions.
 */



    }
}

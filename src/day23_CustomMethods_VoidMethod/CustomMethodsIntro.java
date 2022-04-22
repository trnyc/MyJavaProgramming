package day23_CustomMethods_VoidMethod;

public class CustomMethodsIntro {
    public static void main(String[] args) {

        System.out.println("Test Started");

        greeting();
        greeting();

        System.out.println("Test Completed");


    }


    public static void greeting(){
/* this 'greeting()' method is outside of the 'main' method. Inside the main
method, you can call and execute 'greeting()' method that you created.
it dosnt matter if you put your method before or after main method.
 */
        System.out.println("Hello Cydeo!");
        System.out.println("How are you today?");
    }




}



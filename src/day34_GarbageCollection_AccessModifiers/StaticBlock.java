package day34_GarbageCollection_AccessModifiers;

public class StaticBlock {

    /*
    in java, if there is a 'static block' in your class, the first thing that will be executed is this
    'static block' even if it comes after, and even before main method. This is exception to the rule
    'top to bottom - left to right'. See the example below. Static block runs before anything and
    runs only one time.
     */

    public static void main(String[] args) {

        System.out.println("Main Method");

    }



    static{ // ** static block **

        System.out.println("Static Block"); // this executes first
// runs first, runs only once, runs before anything

    }

}

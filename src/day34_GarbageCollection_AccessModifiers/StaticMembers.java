package day34_GarbageCollection_AccessModifiers;

public class StaticMembers {


    static class class1{ // only inner classes can be static

    }


    public static int number = 100; // variables can be static

    public static void method(){ // methods can be static

    }

    static{ // blocks can be static

    }


}


class A {

   static class B { // inner class can be static

        public static void method1(){ // method

        }

    }

}

//we can call a static class by its outer class name

class C{
    public static void main(String[] args) {
        A.B.method1();
    }
}









/*
    ** IN JAVA
        * VARIABLES
        * METHODS
        * BLOCKS  ======>> CAN BE STATIC
        * FOR CLASSES, THERE ARE SOME PRECCONDIDIONS
            * 1- IT MUST BE AN INNER CLASS, OUTER CLASS CAN NOT BE STATIC
            * 2-
 */
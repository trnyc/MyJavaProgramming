package day45_Abstraction;

public interface PropertiesOfInterface {

    int a = 100;  // static & final by default
    static int b = 200; // final by default

    // ** YOU CAN NOT USE ENCAPSULATION IN INTERFACE, SO YOU CAN NOT USE PRIVATE ACCESS MODIFIER

    /*
    public PropertiesOfInterface(int a){
        this.a =a; // YOU CAN NOT HAVE CONSTRUCTOR IN INTERFACE
    }
    */

    /*
    static{ // INTERFACE IS NOT A CLASS, YOU CAN NOT HAVE STATIC BLOCK IN INTERFACE
        b = 100;
    }
    */

    /*
    public void method1(){ // INTERFACE CAN NOT HAVE INSTANCE METHOD
        System.out.println("Instance method");
    }
     */

    //***** After java 8 it became possible to use static and default methods in INTERFACE
    //***** Before that only abstract method can be used in interface

    static void method2(){
        System.out.println("Static method");
    }

    void method3();

    default void method4(){
        System.out.println("Default method");
    }

}

class Test implements PropertiesOfInterface{

    @Override
    public void method3() {

    }

    public static void main(String[] args) {

        new Test().method4();

    }


}

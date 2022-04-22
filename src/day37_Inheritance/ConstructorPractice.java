package day37_Inheritance;

class A {
    public A() { // default constructor
    //public A(int a) {  constructor with parameter (not default)
        System.out.println("A");
    }
}

class B extends  A{
    public B(){ // default constructor
        // super(9); => you will need this if constructor in parent class A is not default
        System.out.println("B");
    }
}

/*
Here class A and B have default constructors. So when we do 'inheritance', for ex. class B extends class A
we dont need to use 'super()' keyword. Compiler implicitly use 'super()' keyword because constructor is a
default one. If the constructor is not default, (means has parameters) than you have to call it by
using super keyword, and its mandatory to call it.
 */



public class ConstructorPractice {

    public static void main(String[] args) {

        B obj = new B();// A B
/* Here, even if we create an obj from class B, since class B is child of class A, first it will print
the constructor in class A and then print B.
 */


    }
}

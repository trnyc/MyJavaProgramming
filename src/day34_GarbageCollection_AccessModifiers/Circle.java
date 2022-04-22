package day34_GarbageCollection_AccessModifiers;


import java.util.ArrayList;

public class Circle {

    public double radius;
    public static double pi;
    public static String name;

    public static ArrayList<Integer> numbers;
    //add.numbers(10); => not possible like this


    public Circle(double radius){
        this.radius = radius;
        //pi = 3.14;  => Do NOT use 'static' in the constructor. it doeant give error but its not efficient
    }


   static{
        //radius = 5; ==> static does not accept instance, gives compile error
        pi = 3.14;
        name = "Circle";

        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
    }


  /* for any static variable, when it takes more than one step to set it, its the best option to do it in static block.
     AND, we van not usu main method, because in main methor yuu can use variebles only in same class.
   */


/*
    public static void main(String[] args) {

        pi = 3.14;
        name = "Circle";
        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);

        System.out.println("pi = " + pi);
        System.out.println("name = " + name);
        System.out.println("numbers = " + numbers);

    }
*/


}

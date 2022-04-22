package day33_Statics;

public class Iphone {

    public static String brand = "Apple"; // Since all the iphones have the same brand we can declare brand as 'static'

    public String model; // there are different iphone models, so we cant declare model as 'static'

    public double price;

    public static String OS = "IOS";

    public String color;

    public String size;

    public static String madeIn = "China";

    public static boolean hasBattery = true;

    public static boolean isTouchScreen = true;

    public static boolean hasFaceTime = true;


    /*
    to call and use 'static' variables in another class, just you need to type class name and put a dot (.)
    the list of static variables will show up. BUT when you need to use instance variables, you MUST use
    objects.
     */

    public static void printModelAndPrice(){ // static method does not accepts instances
        //System.out.println(model+ " : " + price);
    }


    public void method1(){ // instance method accepts both static and instance
        System.out.println(model + " : "+ price);
        System.out.println(OS);
    }


}

package day34_GarbageCollection_AccessModifiers;

public class AccessModifiers {

    public static int publicData = 100; // accessable from anywhere
    static int defaultData = 200; // access modifier: default - accessable under same package
    private static int privateData = 300; // accessable only in the same class

    public static void method1(){
        System.out.println("Public");
    }

    static void method2(){
        System.out.println("Default");
    }

    private static void method3(){
        System.out.println("Private");
    }



    public static void main(String[] args) {

        System.out.println(publicData);
        System.out.println(defaultData);
        System.out.println(privateData);

    }


}
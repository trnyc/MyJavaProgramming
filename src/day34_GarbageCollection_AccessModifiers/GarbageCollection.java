package day34_GarbageCollection_AccessModifiers;

import java.util.Locale;
import day30_CustomClass.Dog;
import day31_Constructors.Student;
import day32_Constructors.Car;
import java.util.ArrayList;
import java.util.Arrays;


public class GarbageCollection {
    public static void main(String[] args) {


        //int a = null; not possible to assign 'null' to primitive
        String str = null; // null means, no data , empty
        System.out.println(str);
        System.out.println(str.toUpperCase());

        /* 'null' can be assigned only to non-primimives
          * Any variable that does not reference any object can be eligible for 'garbage collection'
          * Garbage collector collects and destroy these kind of objects.
          * If you want to make your variable / object eligible for garbage collection
                just assign it 'null'
          * Garbage collector will automatically call 'finalize' method and destroy it.
          * You do not need to do anything, it will be done implicitly.
          * Shortly, you need to make your object unreferenced to eligible for garbage collection.
          * The second way to make an object eligible for garbage collection, to assign a new object
         */

        String str2 = "Wooden Spoon"; // after line 13, "Wooden Spoon" will be eligible for garbage collection
        str = null;

        System.out.println( str );

        Car car1 = new Car("Toyota");

        car1 = null;

        System.out.println(car1);

        System.out.println("--------------------------------------");

        Dog dog1 = new Dog();
        dog1.name = "Lucy";

        dog1  =     new Dog();
        dog1.name = "Max";

        System.out.println(dog1);

        String language = "Python";
        language    =   "Java";

        System.out.println(language);

        System.out.println("-----------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(100);

        ArrayList<Integer> list2 = list1 ;

        list2.addAll(Arrays.asList(200, 300, 400));

        System.out.println(list1);
        System.out.println(list2);

        System.out.println(list1 == list2 );

        System.out.println("-----------------------------------");

        Student student1 = new Student("Tahir", 30, 'M', 'B', 14);
        student1.grade = 'A';

        Student student2 = student1;
        student2.name = "Ahmet";

        System.out.println(student1);
        System.out.println(student2);

        System.out.println("------------------------------");

        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Java");

        ArrayList<String> l2 = l1;
        l2.add("Python");


        System.out.println("l1 = " + l1);
        System.out.println("l2 = " + l2);

  /*  There can multiple reference names referencing to the same object.
        its like one room that has two doors.

   */



    }
}

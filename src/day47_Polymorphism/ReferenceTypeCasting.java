package day47_Polymorphism;

import day43_Abstraction.employee.Employee;
import day43_Abstraction.employee.Person;
import day43_Abstraction.employee.Tester;
import day44_Abstraction.animal.Animal;
import day44_Abstraction.animal.Cat;
import day44_Abstraction.animal.Dog;
import day45_Abstraction.shape.Circle;
import day45_Abstraction.shape.Shape;
import day45_Abstraction.shape.Square;

public class ReferenceTypeCasting {
    public static void main(String[] args) {

        // UPCASTING

        Shape shape = (Shape) new Circle(4); // casting done by compiler implicitly - upcasting

        Shape shape2 = new Circle(5);// object type is child of parent type


        // DOWNCASTING
        // Casting the larger reference type (super type/parent) to smaller type (sub type)
        // Downcasting is done explicitly and cast operator is required to be given explicitly

        //   Shape shape = (Shape) new Circle(4); //upcasting



        // WebDriver driver = (WebDriver) new ChromeDriver();

        // Dog  dog2 = new Dog("Max", "Husky", 'M', 3, "Small", "White");;
        //  Dog dog3 = dog2;


        Animal animal = new Dog("Max", "Husky", 'M', 3, "Small", "White");

        //   Dog dog = (Dog)animal; // downcasting
        //  dog.bark();

        System.out.println( animal.getName() );
        // System.out.println( dog.getName() );

        (  (Dog)animal  ).bark(); // you must use parenthesis in order to do DOWCASTING.


        Shape shape1 = new Square(5);

        System.out.println( ((Square) shape1).getSide()  );


        System.out.println("---------------------------------------------------");

        Animal animal2 = new Cat("Jim", "Scotish", 'M', 3, "Small", "White");

        //Cat cat = (Cat) animal2;
        // cat.meow();

        ( (Cat) animal2 ).meow();

        // ( (Dog) animal2 ).bark();
            /* The reference type of 'animal2' is Cat. But we tried to cast it a
            method from 'Dog' class which is bark() method. Since there is no IS A
            relationship between cat and dog classes it will not work.
            There must be IS A (inheritance) relation between the object type and reference
            type we are casting it to, otherwise ClassCastException will be thrown */



        System.out.println("---------------------------------------------------");

        Employee employee = new Tester("Ali",30,'M',42,"SDET",145000.00);

        ( (Tester)employee ).bugReport();

        //  ( (Tester)employee ).unitTest();

        //  ( (Developer)employee ).unitTest();

        //  Driver driver = (Driver) employee;  // line 1
        Person person = (Person) employee; // line 2
        //    Teacher teacher = (Teacher) employee; // line 3

        System.out.println("----------------------------------------------------");

        Shape s1 = new Circle(10);
        s1.area();
        s1.perimeter();

        //  ( (Cube)s1 ).volume();









    }


}



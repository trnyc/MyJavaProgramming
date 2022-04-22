package day34_GarbageCollection_AccessModifiers;

public class TestCircle {

    public static void main(String[] args) {


        System.out.println(Circle.pi);
        System.out.println(Circle.name);
        System.out.println(Circle.numbers);

/* when you run these condes after initialising values under 'main' method in 'Circle' class
it never gives back the values what yuo declare. Because the values you declared under
main method can not be executed in another class. Thets why you need declare them in a 'static' block.
 */

    }

}

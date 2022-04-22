package day39_Recap.shapeTask;

public class ShapeObject {
    public static void main(String[] args) {

        Square square = new Square(10);

        System.out.println(square);

        square.setSide(15);
        System.out.println(square);

        System.out.println("---------------------------------");

 /*  Encapsulation (using private method) allow us to control data.
 it can be changed only by using getter and setter methods.
 An also we can put some conditions to ensure that provided data
 is valid.
  */

        Rectangle rectangle = new Rectangle(5, 7);

        System.out.println(rectangle);

        rectangle.setLength(10); // we changed length

        System.out.println(rectangle.getLength());// we called length

        System.out.println(rectangle);

        System.out.println(rectangle.getName());

        System.out.println("-----------------------------------");


        Circle circle = new Circle(5);

        System.out.println(circle);

        //circle.radius = 15.5 -> not possible to change bec. its private type

        circle.setRadius(15.5);

        System.out.println(circle.getRadius()); // 15.5

        System.out.println(circle);

        System.out.println(circle.getName());





    }
}

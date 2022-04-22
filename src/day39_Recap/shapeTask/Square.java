package day39_Recap.shapeTask;

public class Square extends Shape{

// before using extends keyword, declare additional fields and methods that can not be inherited.

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side<=0){
            System.err.println("Invalid Side: "+ side);
            System.exit(1);
        }
        this.side = side;
    }

    public Square(double side) { // we deleted 'String name' bec. name is already known and must be 'Square'
        super("Square"); // also enter the name as 'Square'
        setSide(side); //this.side = side; => needs to check condition, thats why we changed it
    }

    @Override
    public double area() { // R.click -> Generate -> override methods -> click one
        //return super.area();
        return side * side;
    }

    @Override
    public double perimeter() {
        //return super.perimeter();
        return side * 4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
/*
Square extends Shape:
	variables:
		side;

	Encapsulate the field

	Add a constructor to set the filed

	area(): side * side
	perimeter(): side * 4
	toString(): side, area, perimeter
 */
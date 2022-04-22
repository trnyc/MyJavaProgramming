package day38_Inheritance.carTask;

public class Toyota extends Car {

  /*
  When you put extends keyword near the class name, it automatically gives error because its mandatory
  to call parent class' constructor for a child class. And only a constructor can call a constructor.
  After generating constructor, we can modify brand name as "Toyota", since all the cars in Toyota
  class will be the same brand which is "Toyota". Just delete 'String brand' from first line and
  add "Toyota" in second line for the brand.
   */

    public Toyota( String model, int year, double price, String color, int miles) {
        super("Toyota", model, year, price, color, miles);
    }

    public void reliable(){
        System.out.println(brand+" "+model+" is reliable");
    }

    @Override //
    public void start(){
        System.out.println("Twist the key to ignition to start "+brand+" "+model);
    }


}

/*
1. Toyota:
					extra methods:
							reliable()
 */
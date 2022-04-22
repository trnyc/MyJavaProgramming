package day32_Constructors;

public class C08_CarObjects {

    public static void main(String[] args) {

        Car car1 = new Car("Toyota");

        Car car2 = new Car("Honda", "Civic");

        Car car3 = new Car( "Lexus", "RX350", 2021);

        Car car4 = new Car("BMW", "x6", 2020, 50000);

        Car car5 = new Car("Tesla", "Model 3", 2019, 70000, "Grey");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);












    }
}

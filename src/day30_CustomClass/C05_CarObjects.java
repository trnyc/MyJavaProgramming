package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class C05_CarObjects {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setInfo("Toyota", "Camry", "Grey", 2021, 35000);

        System.out.println(car1);


        Car car2 = new Car();
        car2.setInfo("BMW", "5.20d", "Black", 2022, 40000);

        System.out.println(car2);


        Car car3 = new Car();
        car3.setInfo("Audi", "Q7", "Red", 2019, 45000);

//we can create an array for our car

        //Car[] cars = {car1, car2, car3};

// BUT creating an ArrayList instead of array is better because of its benefits

        ArrayList<Car> carsList = new ArrayList<>();
        carsList.addAll(Arrays.asList(car1, car2,car3));

// To reach brand and price of every car we need loop

        for (Car each : carsList) {
            System.out.println(each.brand + " : "+each.price);
        }// prints brand and price of each car


        System.out.println("----------------------------------------------------------");
 /* Imagine that BMW and Toyota need to recall some of their cars for an issue.
    BMW: 2005-2008  and  Toyota: 1995-1997 years' productions are recalled.
    Write a program if any of our cars is subject this recall.
    And remove if any.
  */

        carsList.removeIf(p-> p.brand.equals("BMW") && p.year >= 2005 && p.year <= 2008);
        carsList.removeIf(p-> p.brand.equals("Toyota") && p.year >= 1995 && p.year <= 1997);






    }
}

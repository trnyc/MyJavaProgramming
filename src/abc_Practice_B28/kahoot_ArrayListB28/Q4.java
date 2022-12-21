package abc_Practice_B28.kahoot_ArrayListB28;

import java.util.ArrayList;

public class Q4 {
    public static void main(String[] args) {


        System.out.println("---------------Question 4------------------");

        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars.remove(2)); // Output= Ford

        System.out.println(cars);

        //When you use remove() method with index number it returns the element that was removed.


    }
}

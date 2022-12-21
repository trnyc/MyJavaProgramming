package abc_Practice_B28.kahoot_ArrayListB28;

import java.util.ArrayList;

public class Q12 {
    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");

        ArrayList<String> cars2 = new ArrayList<>();
        cars2.add("Volvo");
        cars2.add("Ford");


        System.out.println( cars.containsAll(cars2) ); // true



    }
}

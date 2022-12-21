package abc_Practice_B28.kahoot_ArrayListB28;

import java.util.ArrayList;

public class Q13 {
    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");

        ArrayList<String> cars2 = new ArrayList<>();
        cars2.add("Volvo");
        cars2.add("Ford");
        cars.remove("Ford");

        System.out.println(cars + " " + cars2);// Output= [Volvo, BMW] [Volvo, Ford]

    }
}

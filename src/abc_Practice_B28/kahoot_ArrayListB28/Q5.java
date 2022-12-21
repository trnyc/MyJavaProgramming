package abc_Practice_B28.kahoot_ArrayListB28;

import java.util.ArrayList;

public class Q5 {
    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        System.out.println( cars.add("Ferrari") ); // Output = True

        // When you use add() method with object it returns boolean

    }
}

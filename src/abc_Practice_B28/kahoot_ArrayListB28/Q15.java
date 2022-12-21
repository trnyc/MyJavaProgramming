package abc_Practice_B28.kahoot_ArrayListB28;

import java.util.ArrayList;
import java.util.HashSet;

public class Q15 {
    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();
        ArrayList<String> cars2 = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");

        cars2.add("Volvo");
        cars2.add("Ford");

        for (String str : cars2) {
            cars.add(str);
        }

        cars.remove("Volvo");
        System.out.println(cars); // output: [BMW, Ford, Volvo, Ford]



        // create an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();

        // add element to ArrayList
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println("ArrayList: " + numbers);

        // create a HashSet
        ArrayList<Integer> primeNumbers = new ArrayList<>();

        // add elements to the HashSet
        primeNumbers.add(2);
        primeNumbers.add(3);
        System.out.println("primeNumbers: " + primeNumbers);

        // remove all elements of HashSet from ArrayList
        numbers.removeAll(primeNumbers);
        System.out.println("ArrayList after removeAll(): " + numbers);

    }
}

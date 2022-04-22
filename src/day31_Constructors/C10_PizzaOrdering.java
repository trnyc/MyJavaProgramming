package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class C10_PizzaOrdering {
    public static void main(String[] args) {

        //create 100 pizza objects, size smaall, cheese toopping 2, pepperoni topping 3
        //create 100 more pizza objects, size 'M', cheese toopping 3, pepperoni topping 4
        //create 100 more pizza objects, size 'L', cheese toopping 4, pepperoni topping 5

        ArrayList<Pizza> pizzas = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            Pizza smallPizza = new Pizza('S', 2, 3);
            Pizza mediumPizza = new Pizza('M', 3,4);
            Pizza largePizza = new Pizza('L', 4, 5);

            pizzas.addAll(Arrays.asList(smallPizza, mediumPizza, largePizza));

        }

        System.out.println("Total number of pizzas: " + pizzas.size()); // 300 pizzas

        double totalPrice = 0;

        for (Pizza pizza : pizzas) {
            totalPrice += pizza.calcCost();
        }

        System.out.println("totalPrice = " + totalPrice); // 7800.0




    }
}

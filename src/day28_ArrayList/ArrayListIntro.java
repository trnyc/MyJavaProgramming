package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListIntro {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();
                                   //new ArrayList<>();
/* ArrayList doesnt support primitives, but we can use Wrapper Class (ex: Integer)
Declaring first data type is mandatory, second one is optional.
 */

        ArrayList<String> names = new ArrayList<>();

 // yuo can type and print Arraylist directly in the print statement without using any method.

        System.out.println(numbers);
        System.out.println(names);












    }
}
/* ArrayList class supports only non-primitive data types.
   ArrayList size is dynamic, it can be changed.
   When you add or remove any element its size adjusted automatically.
   Since ArrayList does not support primitives, we can use Wrapper Class
     to be able to use primitives

 */
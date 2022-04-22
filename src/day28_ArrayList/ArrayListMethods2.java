package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods2 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);

        list.remove(1);//removes 200 at index 1
        System.out.println(list);// [100, 200, 200, 300, 400, 500]

        //------OR-----------

        int num = 2;
        list.remove(num);// removes 200 at intex 2
        System.out.println(list);// [100, 200, 300, 400, 500]


  //----remove object by using Wrapper Class  Integer-----------------

        Integer num2 = 200; // calling Wrapper Class makes '200' non-primitive, so we can use it
        list.remove(num2);
        System.out.println(list);// [100, 300, 400, 500]

 /*     list.remove(200); ==> if we try to remove like this, java will recognize '200' as index number and
                                will remove the element at index 200 if there is any,
                                otherwise will give 'out of bound' error.

   And also remove() method returns a boolean result, if it successfully removed the given element/object
   */

        System.out.println("---------------------clear() method-------------------");

        list.clear(); // clears everything in ArrayList, the size becomes 0
        System.out.println(list);// []

        System.out.println("-------------indexOf(element) and lastIndexOf(element) methods---------");

/* indexOf() method gives the index number of FIRST matching element given in the parenthesis
   lastIndexOf() method gives the index number of LAST matching element, given in the parenthesis
   both return int value.
 */

        ArrayList<Character> characters = new ArrayList<>();
        characters.add('A');
        characters.add('B');
        characters.add('C');
        characters.add('D');
        characters.add('E');
        characters.add('F');

        characters.indexOf('B'); // 1
        int a = characters.lastIndexOf('D'); // 3, you can assign an int
        System.out.println(a); // 3


        System.out.println("-----------contains() method-----------------------");

// returns boolean if the given element included in the given variable

        boolean r2 = characters.contains('A'); // true
        boolean r3 = characters.contains('Z'); // false


        System.out.println("------------------  equals() method   ------------");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(100);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(100);
        list2.add(100);

        System.out.println(list1 == list2); // gives false because they are different objects in the memory
                                            // so we cant use == operator for non-primitives

        System.out.println(list1.equals(list2)); // gives true, but same elements must be at same order.


        System.out.println("------------- isEmpty() method  -----------------------");
// gives boolean result 'true' if there is no element in the ArrayList

        boolean r4 = list1.isEmpty(); // false
        System.out.println("r4 = " + r4);

        list2.clear(); //made list2 empty
        boolean r5 = list2.isEmpty(); // ture


        System.out.println("---------------- addAll() method  ------------------");
/* addAll() method is used to add multiple element to an ArrayList. But we must use 'asList' method
to be able to add multiple elements, that converts array of values to a collection type. */


        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7));
        System.out.println(numbers);












    }

}

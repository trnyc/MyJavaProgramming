package topicsKahoot.week11_Strings_Arrays_ArrayList_Methods_B28;

import java.util.ArrayList;

public class Q9_ArrayListEmptyTrue {

    public static void main(String[] args) {

        ArrayList<Double> list = new ArrayList<>();
        System.out.println("list = " + list);// Since we didnot add any value, it will return empty.  Result is ===> list = []
        //created an empty ArrayList, but sets the capacity to the defined int number
        //-> by default the capacity is 10

        //list.add(20.5);
        //list.add(30.2);
        //list.add(15.3);
        //list.add(45.2);
        //System.out.println("listAdded = " + list); // it will give us the list of elements. Result is ===> listAdded = [20.5, 30.2, 15.3, 45.2]

        System.out.println(list.isEmpty()); // It returns TRUE because it does not have any element.


        //GOOD to REMEMBER
        //isEmpty(): checks if there is any elements in the ArrayList
        //add(element): adds the element to the end of the ArrayList
      //  remove(element): remove the element that was defined from the ArrayList.
        //contains(element): checks if the ArrayList has the given element
        //equals(ArrayList) checks if the given ArrayList is equal to the ArrayList using the method
        //	returns boolean



    }

}

package topicsKahoot.week11_Strings_Arrays_ArrayList_Methods_B28;

import java.util.ArrayList;

public class Q10_ArrayListRemove {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("list = " + list);// Since we didnot add any value, it will return empty.  Result is ===> list = []
        //created an empty ArrayList, but sets the capacity to the defined int number
        //-> by default the capacity is 10

        list.add(20);
        list.add(30);
        list.add(15);
        list.add(23);
        System.out.println("list = " + list); //list = [20, 30, 15, 23]

        list.remove(2);
        System.out.println("list = " + list); //list = [20, 30, 23]


        list.remove("20");// Removes object
        System.out.println(list.remove("20"));//Since there is not any 20 object, remove object method returns boolean/false
        System.out.println("listremoveobject = " + list);


    }
}

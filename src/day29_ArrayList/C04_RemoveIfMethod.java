package day29_ArrayList;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class C04_RemoveIfMethod {
    public static void main(String[] args) {

/* IMPORTANT ==>  in ArrayList we can not use remove() method in any type of loop.
    it does not give expected result. Because ArrayList is dynamic and during each
    iteration of loop, the index numbers of elements changes. And it gives unexpected
    result.
    INSTEAD, we can use removeIf() method in loop
    AND, if we want to use removeIf() method, also we need to use lambda expression.  */


        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) % 2 != 0 ){
                list.remove(i);// normally it must remove all odd numbers, BUT will not
                // we can not use remove() method to remove an element of an ArrayList in a loop
                // since ArrayList size is dynamic. We must use Iterable or removeIf() instead
            }
        }
        System.out.println(list);

//* * remove all elements less than 5 (using REMOVEıF AND LAMBDA )
        list.removeIf(p -> p < 5); // p: each element in arrayList, removes each if it is less than 5
                                //This iterates a loop

        System.out.println(list);


        System.out.println("---------------------------------------------");
//remove all even numbers
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        list2.removeIf(each-> each % 2 ==0);// each: each element in the arraylist

        System.out.println(list2);

        System.out.println("-------------------------------------------");

// remove all elements starts with "J"
        ArrayList<String> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList("Java", "Python", "JavaScript", "C#", "C++", "Java", "Java"));

        list3.removeIf(p-> p.startsWith("J"));

        System.out.println(list3);


        System.out.println("--------------------------------------");

// remove oll "palindirome" string elements
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Anna", "Racecar", "Level", "Eye", "Java", "Python", "Cydeo"));

        names.removeIf(name-> StringUtility.isPalindrome(name));// we used a method created by us before

        System.out.println(names);








    }
}

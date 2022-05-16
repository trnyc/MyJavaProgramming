package day48_Collections;

import java.util.*;

public class ListIntro {

    public static void main(String[] args) {

        //List<Integer> list = new List<>(); // Since List is not class but an Interface, you can not
                                                // create object from List...

        List<Integer> list1 = new ArrayList<>(); // this is possible because ArrayList has IS A relationship
                                                // with List interface. it implements List.
        list1.addAll(Arrays.asList(10, 20, 30, 40, 50, 60));

        System.out.println(list1.get(0));


        List<Integer> list2 = new LinkedList<>();
        list2.addAll(Arrays.asList(10, 20, 30, 40, 50, 60));
        System.out.println(list2.get(0));

        List<Integer> list3 = new Vector<>();
        list3.addAll(Arrays.asList(10, 20, 30, 40, 50, 60));
        System.out.println(list3.get(0));
            // these are subclasses of List interface that you can create objects


        List<Integer> list4 = new Stack<>(); // Stack is child class of Vector
        list4.addAll(Arrays.asList(10, 20, 30, 40, 50, 60));
        System.out.println(list4.get(0));


        System.out.println("-------------------------------------------------------");

        System.out.println(list4); // [10, 20, 30, 40, 50, 60]

        ((Stack) list4).pop();

        System.out.println(list4); // [10, 20, 30, 40, 50]

        ((Stack) list4).pop();

        System.out.println(list4); // [10, 20, 30, 40]
  // .pot() is a unique method only for Stack class. It deletes the last element of the list


    }


    public synchronized void method1(){

    }



}

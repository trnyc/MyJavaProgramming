package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);// it adds integer '10' with the help of WrapperClass
        numbers.add(20);// intex 1
        numbers.add(30);// intex 2
        numbers.add(40);// intex 3
        numbers.add(50);// intex 4
        numbers.add(60);// intex 5
        numbers.add(70);// intex 6 now:[10, 20, 30, 40, 50, 60, 70]

/*  This add() method has also 'insert' function that you can insert an element into ArrayList
by giving index number and element.  */

        numbers.add(2, 25);// now: [10, 20, 25, 30, 40, 50, 60, 70]
                                        // size adjusted automatically
        System.out.println(numbers);


        System.out.println("------------------size() method-----------------------------------");

/* 'size()' method gives total number of elements in ArrayList. If you want to know
last index number, you need subtract 1. */


        System.out.println(numbers.size());// 8

        int lastIndex = numbers.size()-1;


        System.out.println("---------------------get(index) method----------------");
        //brings the element at given index
        // [10, 20, 25, 30, 40, 50, 60, 70]

        int num = numbers.get(4);// num is the number at index 4
        System.out.println("num = " + num); //40

        System.out.println(numbers.get(3)); //30


        System.out.println("-----------------using loop for ArrayList--------------------");


        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println("________set(index, element)_______________________________");
//replaces the element at given index with given element

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C#");
        list.add("Ruby");

              // replacee "Java" with "JavaScript" and "C#" with "C++"

        list.set(2, "JavaScript");
        list.set(3, "C++");

        System.out.println(list);//[Java, Python, JavaScript, C++, Ruby]

        System.out.println("--------------remove(index) method----------------");
 //removes the element at given index, the size being adjusted automatically

        ArrayList<String> employees = new ArrayList<>();

        employees.add("Suat");
        employees.add("Aygun");
        employees.add("Olga");
        employees.add("Neira");
        employees.add("Ali");
        employees.add("Hulya");
        employees.add("Kaloyan");

        System.out.println(employees);//  [Suat, Aygun, Olga, Neira, Ali, Hulya, Kaloyan]

        employees.remove(0);//removes "Suat" at index 0, decrees the size by 1
        System.out.println(employees); // [Aygun, Olga, Neira, Ali, Hulya, Kaloyan]

        employees.remove(0);//removes "Aygun" at index 0, decrees the size by 1
        System.out.println(employees);// [Olga, Neira, Ali, Hulya, Kaloyan]

        employees.remove(0);
        System.out.println(employees);//[Neira, Ali, Hulya, Kaloyan]

        employees.remove(employees.size()-1);// to remove the element at last index
        System.out.println(employees);//[Neira, Ali, Hulya]


        System.out.println();
        System.out.println("----------------------remove(element/object) method--------------------");

        employees.remove("Hulya");
        System.out.println(employees);//[Neira, Ali]

//** remove() method also return boolean result, if it removes the given element returns true, otherwise false

        boolean r1 = employees.remove("Neira");
        System.out.println(employees);//[Ali]
        System.out.println("r1 = " + r1);// true

        boolean r2 = employees.remove("Kemal");
        System.out.println("r2 = " + r2);//false





    }
}

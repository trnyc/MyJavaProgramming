package day53_FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice {
    public static void main(String[] args) {

  /* ** stream() is a special method that allow to use some other methods on Array and Collection types */

        System.out.println("================= distinct() =============================");

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5,6,6));
        list1 = list1.stream().distinct().collect(Collectors.toList());
    // we called stream METHOD and used distinct() to remove duplicates and we used collect() method
        // to collect() it as a list. collect() method also allows you to collect it as Array

        System.out.println(list1);

        int[] arr1 = {1,1,2,2,3,3,4,4,5,5,6,6};
        arr1 = Arrays.stream(arr1).distinct().toArray();

        System.out.println(Arrays.toString(arr1));


        System.out.println("================= skip() =============================");

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list2 = list2.stream().skip(5).collect(Collectors.toList()); // removes first 5 elements
// skip() method of stream() allows you to remove elements from a Collection or Array

        System.out.println(list2); // [6, 7, 8, 9, 10]


        int[] nums2 = {1,2,3,4,5,6,7,8,9,10}; // remove first 4 elements
        nums2 = Arrays.stream(nums2).skip(4).toArray();

        System.out.println(Arrays.toString(nums2)); // [5, 6, 7, 8, 9, 10]


        System.out.println("====================== limit() ==============================");

        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list3 = list3.stream().limit(7).skip(3).collect(Collectors.toList());

        System.out.println(list3);


        System.out.println("====================== map() ==============================");

        List<Integer> list4 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list4 = list4.stream().map( p -> p * 10 ).collect(Collectors.toList());

        System.out.println(list4);


        List<String> days = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));

        days =  days.stream().map( p -> p.substring(0, 3) ).collect(Collectors.toList());

        System.out.println(days);


        System.out.println("====================== filter() ==============================");

        List<Integer> list5 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        List<Integer> evens = list5.stream().filter( p -> p%2==0).collect(Collectors.toList());

        System.out.println(evens);


        List<String> names = new ArrayList<>(Arrays.asList("Java", "java", "jAvA", "Python", "Ruby"));

        long countJava = names.stream().filter( p -> p.equalsIgnoreCase("java")).count();

        System.out.println(countJava);


        names.stream().filter( p -> p.equalsIgnoreCase("java")).forEach( p -> System.out.println(p));


        System.out.println("====================== allMatch() ==============================");
                                            // returns boolean
        List<Integer> list6 = new ArrayList<>(Arrays.asList(1,2,30,4,5,6,7,8,9,10));

        boolean r1 = list6.stream().allMatch(p -> p%2==0); // checks if all the elements are even, returns boolean

        System.out.println(r1);

        boolean r2 = list6.stream().anyMatch(p -> p>20); // checks if any element greater than 20, returns boolean

        System.out.println(r2);

        boolean r3 = list6.stream().noneMatch(p -> p%3==0);//checks if all the elements divisible by 3,
                                                            // if no returns false
        System.out.println(r3);










    }
}

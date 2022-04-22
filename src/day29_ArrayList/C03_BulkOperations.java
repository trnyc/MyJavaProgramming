package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C03_BulkOperations {
    public static void main(String[] args) {

// --------------------- addAll() method -------------------------------

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,3,3,4,5,5,6,7,7,8));

/* we need to use asList() method from Arrays Utility class to be able to add multiple elements
ot an ArrayList. asList() method converts Array to Collection Type.*/

        System.out.println(list);


  // ---------------- removeAll() method----------------------------------
        //removes multiple elements from ArrayList. Again we need to use asList() method

        list.removeAll(Arrays.asList(3,5,7));// removes all 3,5 and 7 (even duplicates) from the ArrayList

        System.out.println(list);


  // ------------------ retainAll() method------------------------
        //keeps all matching elements and removes the rest, Again we need to use asList() method

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(100,200,300,400,500,600,100,200,300,700));

        numbers.retainAll(Arrays.asList(100,200,300));

        System.out.println(numbers);

        System.out.println("---------------------------------------------");

        ArrayList<String> jobTitles = new ArrayList<>();
        jobTitles.addAll(Arrays.asList("QA", "SDET", "Developer", "QA", "SDET", "Scrum Master", "BA", "BA"));

        jobTitles.retainAll(Arrays.asList("QA", "SDET"));

        System.out.println(jobTitles);

  //----------------- containsAll() method -----------------------------
   // checks if multiple elements included in an ArrayList, returns boolean result true/false

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,2,1,3));

  // using contains() method you need to do one by one

        boolean r1 = nums.contains(9);

        boolean r2 = nums.contains(2) && nums.contains(3) && nums.contains(4);

        boolean r3 = nums.containsAll(Arrays.asList(3,5,6));

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);


        System.out.println("---------------------------------------------------------------");

  // Converting OF AN array to an ARRAYLIST if its a non-primitive

        String[] names = {"Ali", "Veli", "Kamil", "Hasan", "Elif"};

   /*     ArrayList<String> namesList = new ArrayList<>();
        namesList.addAll(Arrays.asList(names));     */

        // ------------------OR-----------------------------

        ArrayList<String> namesList = new ArrayList<>(Arrays.asList(names));

        System.out.println(namesList);

  //You can not to the same for an int. you must use wrapper class (Integer) to do it

        Integer[] arr = {1,2,3,4,5,6,7,8,9};

        ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(arr));

        System.out.println(arrList);


        System.out.println("------- EXECUTION OF CUSTOM METHOD BELOW---------");

        int[] arr2 = {1,2,3,4,5,6,7,8,9,10};

        ArrayList<Integer> list3 = new ArrayList<>(convertArrayToArrayList(arr2));

        System.out.println("list3 = " + list3);





    }// END OF MAIN METHOD------------------

// Create a method that can convert an array to ArrayList---------------------------

    public static ArrayList<Integer> convertArrayToArrayList(int[] array){

        ArrayList<Integer> list = new ArrayList<>();

        for (int each : array) {
            list.add(each);
        }
        return list;
    }








}

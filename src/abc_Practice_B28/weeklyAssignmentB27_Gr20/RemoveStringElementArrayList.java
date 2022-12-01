package abc_Practice_B28.weeklyAssignmentB27_Gr20;

import java.util.*;

public class RemoveStringElementArrayList {

    public static void main(String[] args) {



    /*  2. ArrayList -- Remove "Ahmed"
Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
Write a java operation to remove all the names named Ahmed
*/


// Solution 1

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));

        names.removeAll(Arrays.asList("Ahmed"));

        System.out.println(names);


//        boolean ahmed = names.remove("Ahmed");
//        System.out.println(names);
//        System.out.println(ahmed);
//
//        boolean ahmed1 = names.remove("Ahmed");
//        System.out.println(names);
//        System.out.println(ahmed1);
//
//        boolean ahmed3 = names.remove("Ahmed");
//        System.out.println(names);
//        System.out.println(ahmed3);


// Solution 2

//        List<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed".));
//
//        for(ListIterator<String> it = names.listIterator(); it.hasNext();)
//
//            if(it.next().equals("Ahmed"))
//
//                it.remove();
//
//        System.out.println(names);


// Solution 3

//        List<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
//
//        List<String> names2 = new ArrayList<>();
//
//        names.forEach(p-> {if(!p.equals("Ahmed")) names2.add(p);}  );
//        names = names2;
//        System.out.println(names);


// Solution 4

//        List<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
//
//        Iterator<String> it = names.iterator();
//
//        while(it.hasNext()) {
//
//            if(it.next().equals("Ahmed"))
//
//                it.remove();
//        }
//
//        System.out.println( names );



    }




}

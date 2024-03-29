package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C10_ArrayListPractice2 {
    public static void main(String[] args) {

        ArrayList<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Ali", "David", "Ahmed", "Jimmy", "Daniel", "Aaron", "Ahmed", "David", "Shay"));

        employees.retainAll(Arrays.asList("Ahmed", "David"));

        System.out.println(employees);


        System.out.println("----------------------------------------------------");

        //remove all the elements start with 'M'
        String[] names = {"Mary", "Monica", "Mehray", "Musti", "Sumeyra", "Hasan", "Beril"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(names));//converting Array to ArrayList

        list.removeIf(p-> p.charAt(0)== 'M');

        System.out.println(list);

        names = list.toArray(new String[0]);

        System.out.println(Arrays.toString(names));




    }
}

package day51_Map;

import java.util.HashMap;
import java.util.Map;

public class MapMethods {
    public static void main(String[] args) {

        // student name & score:

        Map<String, Integer> students = new HashMap<>();
        students.put("Aygun", 95);
        students.put("Maria", 95);
        students.put("Ali",95);
        students.put("Alex",96);
        students.put("Ozan",98);
        students.put("Serkan",97);
        students.put("Andriy",98);

        students.put("Ali",85);
        students.put("Ali",86);
        students.put("Ali",87); // accepts only last 'Ali', deletes the others

        System.out.println(students);
        System.out.println(students.size()); // 7


        // display the score of Alex:
        System.out.println(students.get("Alex"));// 96 => when you call by 'key', it returns 'value'


        // replace Ali' score to 90

        students.replace("Ali", 90 );
        System.out.println(students.get("Ali")); // now 90

        System.out.println(students);

        students.remove("Alex"); // removes by 'key'

        System.out.println(students);

        students.remove("Ozan");

        System.out.println(students);


        boolean r1 = students.containsKey("Muhtar");
        boolean r2 = students.containsKey("Serkan");
        System.out.println(r1);
        System.out.println(r2);



        boolean r3 = students.containsValue(97);

        System.out.println(r3);


        System.out.println(students.isEmpty());


        System.out.println("-------------------------");

        Map<String, Integer> map1 = new HashMap<>();
        map1.putAll(students);

        Map<String, Integer> map2 = new HashMap<>();
        map2.putAll(students);


        System.out.println("map1 = " + map1);
        System.out.println("map2 = " + map2);

        System.out.println(map1 ==  map2); // false, because they are two different objects
        System.out.println(map1.equals(map2)); // true, because they are same

        map1.clear(); // clear everything
        map2.clear();

        System.out.println(map1);
        System.out.println(map2);

    }
}

package day51_Map;

import java.util.*;

public class MapClasses {
    public static void main(String[] args) {

        //Map<Integer, String> map1 = new HashMap<>();
        /*
        ** HashMap maintains random order
        * Accepts only 1 null for key type
         */

        Map<Integer, String> hashMap = new HashMap<>();
        //         key    value
        hashMap.put(10, "Arthur");
        hashMap.put(20, "George");
        hashMap.put(3, "Jack");
        hashMap.put(40, "Emma");
        hashMap.put(5, "Ahmet"); // not accept duplicated 'key', so pair of "5, Ahmet" will be deleted
        hashMap.put(5, "Isabella");
        hashMap.put(6, null); // accepts multiple null for 'value' side
        hashMap.put(7, null);
        hashMap.put(8, null);
        hashMap.put(null, "Hulya"); // accepts only 1 null for 'key', keeps only the last one, deletes the others
        hashMap.put(null, "Emre");
        hashMap.put(null, null );

        System.out.println("hashMap = " + hashMap);

        // System.out.println(hashMap.get());
        System.out.println("============================================================================");


        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
 // linkedHashMap keeps insertion order
        linkedHashMap.put(10, null);// accepts multiple null for 'value' side
        linkedHashMap.put(20, null);
        linkedHashMap.put(3, "Jack");
        linkedHashMap.put(40, "Emma");
        linkedHashMap.put(50, "Emma");// accepsts duplicated 'value'
        linkedHashMap.put(5, "Ahmet");
        linkedHashMap.put(5, "Isabella");// does not accept duplicated 'key', keeps only the last one
        linkedHashMap.put(null, "Hulya");
        linkedHashMap.put(null, "Kazım"); // accepts only one null for 'key' side,

        System.out.println("linkedHashMap = " + linkedHashMap);

        System.out.println("============================================================================");


        Map<Integer, String> treeMap = new TreeMap<>(); // Key can not be null, value can be null and duplicated
// put the pairs ascending order according to the 'key'
        treeMap.put(10, "Arthur");
        treeMap.put(20, "George");
        treeMap.put(3, null); // accept null for 'value' side
        treeMap.put(40, "Emma");
        treeMap.put(5, "Ahmet");
        treeMap.put(5,"Isabella"); // does not accept duplicated 'key'
        treeMap.put(7, null);
        //treeMap.put(null, "Kazım"); // does not accept null for 'key' side

        System.out.println("treeMap = " + treeMap); //{3=null, 5=Isabella, 7=null, 10=Arthur, 20=George, 40=Emma}

        System.out.println("============================================================================");


        Map<Integer, String> hashtable = new Hashtable<>(); // key and value both can not null
        hashtable.put(10, "Arthur");
        hashtable.put(20, "George");
        hashtable.put(22, "George"); //accepts duplicated 'value'
        hashtable.put(3, "Jack");
        hashtable.put(40, "Emma");
        hashtable.put(5, "Ahmet");
        hashtable.put(5,"Isabella"); // does not accept duplicated 'key'
        //hashtable.put( null, "ali") // does not accept any null
        // hashtable.put(9, null); // does not accept any null

        System.out.println("hashtable = " + hashtable);



        //   String str = null;
        // System.out.println(str.toUpperCase());


/*
browser   chrome
url
username   cydeo
password  cydeo123
 */

    }
}

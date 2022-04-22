package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C09_ArrayListPractice1 {
    public static void main(String[] args) {

        String[] countries = {"Japan", "Korea", "United States", "Turkey", "United Kingdom", "Canada" };

        //------------converting array to ArrayList------------
        ArrayList<String> list = new ArrayList<>(Arrays.asList(countries));

        list.removeIf(p-> p.length() >= 10);// will remove the names has more than 10 chars

        //---------------converting arraylist to array----------------
        countries = list.toArray(new String[0]);// we give siz of string array '0' bec. it will fit new size

        System.out.println(Arrays.toString(countries));





    }
}
/* 1--Create an array of string called countries
   2--write a program that can remove all the country names that have length of 10 greater
 */
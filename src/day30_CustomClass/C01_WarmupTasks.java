package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class C01_WarmupTasks {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        Collections.swap(numbers, 0, numbers.size()-1);

        System.out.println(numbers); // [9, 2, 3, 4, 5, 6, 7, 8, 1]


        System.out.println("-----------------------------------------------------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        int size = list.size();
        list.removeAll(Arrays.asList(0));

        System.out.println("list = " + list); // [1, 2, 3, 4]

        int newSize = list.size();

        int totalNumberOfZeros = size - newSize;

        System.out.println("totalNumberOfZeros = " + totalNumberOfZeros); // 4

// How to add back all zeros ta ArrayList

        for (int i = 0; i < totalNumberOfZeros; i++) {
            list.add(0);
        }
        System.out.println(list);

        System.out.println("------ second solution with loop-------");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : list2) {
            if(each != 0){ // if its not zero add it to result, if its zero dont
                result.add(each);
            }
        }
        System.out.println("result = " + result); // 1 2 3 4

  // How to add zeros back


        for (Integer each : list2) {
            if(each == 0){ // if its zero add it to result, if its not zero dont
                result.add(each);
            }
        }
        System.out.println("result = " + result); // 1 2 3 4 0 0 0 0


        System.out.println("--------- task 3----------------------");

        String str = "ABCD123$%#@&456EFG!";

        ArrayList<Character> chars = new ArrayList<>(); //

        for (int i = 0; i < str.length(); i++) {
            chars.add(str.charAt(i));
        }

        ArrayList<Character> letters = new ArrayList<>(chars);// adds all the characters
        letters.removeIf(p-> !Character.isLetter(p));// lambda, removes if the character is NOT letter

        System.out.println("letters = " + letters);


        ArrayList<Character> digits = new ArrayList<>(chars);
        digits.removeIf(p-> !Character.isDigit(p));//removes if the character is not digit

        System.out.println("digits = " + digits);


        ArrayList<Character> specialChar = new ArrayList<>(chars);
        //specialChar.removeAll(letters);
        //specialChar.removeAll(digits);
        specialChar.removeIf(p-> Character.isLetterOrDigit(p));

        System.out.println("specialChar = " + specialChar);



    }
}
/*
1. write a program that can swap the first and last elements of an ArrayList
2. Write a program that can move all the zeros to the last indexes of ArrayList
					Ex:
						list: {1,0,2,0,3,0,4,0}
					output:
						[1, 2, 3, 4, 0, 0, 0, 0]
3. Write a program that can extract the special characters, digits and letters from a string and stores them into separate ArrayLists of Characters
				Ex:
					str = "ABCD123$%#@&456EFG!"
				output:
					list1: {1, 2, 3, 4, 5, 6}
					list2: {A, B, C, D, E, F, G}
					list3: {$, %, #, @, &, !}
 */
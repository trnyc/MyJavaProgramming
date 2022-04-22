package day21_ForEachLoop;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {

        String[] group1 = {"Ali", "Veli", "Huseyin"};
        String[] group2 = {"Ayse", "Fatma", "Huriye", "Kamil", "Hasan"};

        String[] students = new String[group1.length + group2.length];
                    //to have total size of two arrays
        int i = 0;
        for (String each : group1) {
            students[i++] = each; //will put each element of group1 into 'students'
        }

        for (String each : group2) {
            students[i++] = each; //will put each element of group2 into 'students'
        }

        System.out.println(Arrays.toString(students));
   //YOU CAN USE 'FOR LOOP' TO DO SAME

        System.out.println("--------------------------------------------------");

        char[] ch1 = {'A', 'B', 'C'};
        char[] ch2 = {'D', 'E', 'F', 'G', 'H'};

        char[] chars = new char[ch1.length + ch2.length];

        int j = 0;

        for (char ch : ch1) {
            chars[j]= ch;
            j++;
        }

        for (char ch : ch2) {
            chars[j]= ch;
            j++;
        }

        System.out.println(Arrays.toString(chars));


    }
}

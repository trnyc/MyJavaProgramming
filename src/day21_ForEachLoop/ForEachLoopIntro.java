package day21_ForEachLoop;

public class ForEachLoopIntro {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50, 60, 70};

        for (int i = 0; i < numbers.length; i++) {
            int eachElement = numbers[i];
            System.out.println(eachElement);
        }// this is regular for loop


        System.out.println("------------------for each--------------------");

        for(int each : numbers ){
            System.out.println(each);
        }

    }
}

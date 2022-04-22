package day08_IfStatements;

public class EvenlyDivsible {
    public static void main(String[] args) {

        int number = 65;
        boolean divisibleBy2 = number % 2 == 0;// false
        boolean divisibleBy3 = number % 3 == 0;// false
        boolean divisibleBy5 = number % 5 == 0;// true
/*for each number we check if there is any leftover (kalan). if there is, it means <number>
is not evenly divisible, if there is no leftover, it means <number> is evenly divisible
 */
        System.out.println(number + " is evenly divsible by 2: " + divisibleBy2);
        System.out.println(number + " is evenly divsible by 3: " + divisibleBy3);
        System.out.println(number + " is evenly divsible by 5: " + divisibleBy5);

    }
}
/*
2. Create a class called EvenlyDivisible,and write a program that can
check if a number is evenly divisible by 2, 3, 5
Ex:
number = 65;
output:
65 is divisible by 2: false
65 is divisible by 3: false
65 is divisible by 5: true
 */
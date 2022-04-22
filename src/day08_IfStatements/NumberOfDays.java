package day08_IfStatements;

public class NumberOfDays {
    public static void main(String[] args) {

        int number = 5;

        boolean has28days = number == 2;//for the month that has 28 days
        boolean has30days = number == 4 || number == 6 || number == 9 || number == 11;
                            //for the months that have 30 days
        boolean has31days = !has28days && !has30days;//for the rest, that have 31 days

        if(has28days) { //if its TRUE that given number of month has 28 days will be printed
            System.out.println("28 days");
        }

        if(has30days) {//if its TRUE that given number of month has 30 days will be printed
            System.out.println("30 days");
        }

        if(has31days) {//if its TRUE that given number of month has 31 days will be printed
            System.out.println("31 days");
        }


    }
}
/*
Task
1. write a program that can display the name of the month
number = 1 ~ 12
2. write a program that can display the name of the day
number = 1 ~ 7
3. Write a program that can print the number of days in a month
Ex:
number = 1 ~ 12;
output:
31 Days
Hints: Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
Months that has 30 days: 4, 6, 9, 11
Month that has 28 days: 2
 */
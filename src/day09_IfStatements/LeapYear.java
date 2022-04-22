package day09_IfStatements;

public class LeapYear {
    public static void main(String[] args) {

        int year = 2000;
        boolean leapYear = year % 4 == 0;

        if(leapYear) {
            System.out.println("Year " + year + " is leap year");
        }

        if(!leapYear) {
            System.out.println("Year " + year + " is NOT leap year");
        }

//instead of using 2 different statement, we can use if.. else in one statement to do the same.
        System.out.println("----------------------------------------------");

        if(leapYear) {
            System.out.println("Year " + year + " is leap year");
        }else{
            System.out.println("Year " + year + " is NOT leap year");
        }



    }
}

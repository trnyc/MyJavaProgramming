package day08_IfStatements;

public class LeapYear {
    public static void main(String[] args) {

        int year = 2000;
        boolean isLeapYear = year % 4 == 0;//if no remainder, its leap year
        System.out.println(year + " is leap year: " + isLeapYear);
    }
}

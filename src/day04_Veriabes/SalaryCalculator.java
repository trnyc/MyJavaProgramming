package day04_Veriabes;

public class SalaryCalculator {

    public static void main(String[] args) {

        //hourlyRate , weeklyHours
        int hourlyRate = 50;
        int weeklyHours = 40;

        int salary = hourlyRate * weeklyHours * 52;

        //  System.out.println(salary);
/* soutv is the shortcut for variables you typed. just double click on the
blue line when it sohwed up. And if you want to use for ex $ sign you must add it
just after = sign
 */

        System.out.println("hourlyRate = $ " + hourlyRate);
        System.out.println("weeklyHours = " + weeklyHours);
        System.out.println("salary = $ " + salary);


    }

}

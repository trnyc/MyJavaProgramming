package day09_IfStatements;

public class NameOfDay {
    public static void main(String[] args) {

        int n = 5;//between 1-7 will be given for the name of the days
        String day;

        if(n == 1) {
         //   System.out.println("Monday");
            day = "Monday";
        }
        else if(n == 2) {
         //   System.out.println("Tuesday");
            day = "Tuesday";
        }
        else if(n == 3) {
         //   System.out.println("Wednesday");
            day = "Wednesday";
        }
        else if(n == 4) {
         //   System.out.println("Thursday");
            day = "Thursday";
        }
        else if(n == 5) {
         //   System.out.println("Friday");
            day ="Friday";
        }
        else if(n == 6) {
         //   System.out.println("Saturday");
            day = "Saturday";
        }
        else{
          //  System.out.println("Sunday");
            day = "Sunday";
        }
        System.out.println("Day = " + day);

    }
}

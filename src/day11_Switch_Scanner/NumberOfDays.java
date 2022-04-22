package day11_Switch_Scanner;

public class NumberOfDays {
    public static void main(String[] args) {

        int number = 2;
        int year = 2000;

        String result = "";

        if(number >= 0 && number <=12){

            switch (number){
                case 2:
                    result = (year % 4 == 0)? "29 days" : "28 days";// ternaries
                    //if (?) its leap year print 29 days, otherwise (:) 28 days
                    break;

                case 4: case 6: case 9: case 11: //if its 4,6,9 or 11
                    result = "30 days";
                    break;

                default:
                    System.out.println("31 days");

            }

        }else{
            result = "Invalid Number";
        }
        System.out.println(result);

    }
}

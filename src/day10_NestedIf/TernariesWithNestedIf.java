package day10_NestedIf;

public class TernariesWithNestedIf {
    public static void main(String[] args) {

        int s = 5000;

        /*
        if(s >= 0 && s <= 100){
            if(s >= 60){
                System.out.println("Passed");
            }else{
                System.out.println("Failed");
            }
        }else{
            System.out.println("Invalid Score");
        }           LETS CONVERT IT TO TERNARIES
        */

        String result = (s >= 0 && s <= 100)? (s >= 60)? "Passed" : "Failed" : "Invalid Score";
   /* -if its valid data-/-check next-/if its greater than 60 print "passed"-/
   otherwise (else) print failed-/-if its invalid data pirint "invalid score"

   NORMALLY its not recommended convert a nested if to ternaries
             especially if its too long
    */


        System.out.println("result = " + result);









    }
}

package day08_IfStatements;

public class EligibleToVote {
    public static void main(String[] args) {

// THINK THAT ONE PERSON MUST BE 18 AND US CITIZEN TO VOTE IN USA
// USING 'IF' PRINT GIVEN PERSON IS ELIGIBLE OR NOT

        String name = "Josh";
        int age = 38;
        String citizen = "USA";

        boolean isEligible = age >= 18 && citizen == "USA";

        //ELIGIBLE
        if(isEligible) {
            System.out.println("Eligible");
        }
        if(!isEligible) {
            System.out.println("Not Eligible");
        }



    }
}

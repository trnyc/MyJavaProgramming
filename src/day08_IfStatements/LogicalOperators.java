package day08_IfStatements;
/*
&& : BOTH (both/all must be true)
|| : EITHER (one of them must be true)
!  : NONE (both of them must be false)
 */
public class LogicalOperators {
    public static void main(String[] args) {

//Ex: for vote in US, must be 18 and US citizenship.
        String name = "Jhon";
        int age = 19;
        String citizen = "UK";

        boolean isEligible = age >= 18 && citizen == "USA";
//                            19 >= 18 &&  UK   ==  USA
       //                      true           false  ==> false(both must be true to get true)

        System.out.println(name + " is eligible to vote: " + isEligible);//false


        String name2 = "James";
        int age2 = 17;
        String citizen2 = "USA";

        boolean isEligible2 = age2 >= 18 && citizen2 == "USA";
        System.out.println(name2 + " is eligible to vote: " + isEligible2);

        System.out.println("-----------------------------------------------------------");

  //EX: eligible for bank loan: must be 21 and must have credit score 700 and income 65000

        String name3 = "Kevin";
        int age3 = 23;
        int creditScore = 730;
        int income = 50000;

        boolean isEligible3 = age3 >= 21 && creditScore >=700 && income >= 65000;
        System.out.println(name3 + " is eligible for loan: " + isEligible3);

        System.out.println("-----------------------------------------------------------");

        String name4 = "Jane";
        int age4 = 21;
        char gender = 'F';

        boolean isEligible4 = age >= 18 && (gender == 'M' || gender == 'F');
                        //       true      (false              true  )
                        //       true                  true
                        //                  TRUE
        System.out.println(name4 + " is eligible to register: " + isEligible4);

        System.out.println("-----------------------------------------------------------");

// ELIGIBLE TO BE US CITIZEN?

        String name5 = "George";
        String countryOfBirth = "UK";
        boolean merriedToUSCitizen = false;

        boolean isEligible5 = countryOfBirth == "USA" || merriedToUSCitizen == true;

        System.out.println(name5 + " is eligible to apply: " + isEligible5);

//ELIGIBLE FOR SCHOLARSHIP?

        String name6 = "Anna";
        double gpa = 2.5;
        int familyIncome = 40000;
        boolean isEligible6 = gpa >= 3.5 || familyIncome <= 60000;
                                     //  OR
        System.out.println(name6 + " is eligible for scholarship: " + isEligible6);

// LOGICAL NOT OPERATOR (!)

        int score = 85;
        boolean passed = score >= 60;//did he pass? Yes, so its true
        boolean failed = !passed;// didnt he pass? No he passed, so its false

        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);



    }

}

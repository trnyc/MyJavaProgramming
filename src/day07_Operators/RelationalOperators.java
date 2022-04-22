package day07_Operators;

public class RelationalOperators {
    public static void main(String[] args) {
        /*  >: greater than
           >=: greater than or equal
            <: less than
           <=: less than or equal
         */

        boolean result1 = 20 > 40; // will give false
        System.out.println("result1 = " + result1);

        boolean result2 = 300>=150;//must be greater than or equal. two conditions
        System.out.println("result2 = " + result2);

        boolean result3 = 100 >= 100;
        System.out.println("result3 = " + result3);

//Ex: if the credit score is at least 720, hi is eligible for loan.
        int creditScore = 745;
        boolean isEligimleForLoan = creditScore >=720;//if I use > only, its a bug.

        boolean result5 = 100 < 120;//true
        System.out.println("result5 = " + result5);

        boolean result6 = 200 < 180;// false
        System.out.println("result6 = " + result6);

// (<=) Ex: the student is fail if the score less than or equal to 59
        int score = 59;
        boolean hasFailed = score <= 59; //true
        System.out.println("hasFailed = " + hasFailed);

        boolean result7 = 45 <= 60; // false
        System.out.println("result7 = " + result7);

/* (==) EQUAL OPERATOR: we use two signs because single sign (=) is reserved for
assignment. Equal operator (==) can be used for strings.
 */
        int x = 100;
        int y = 200;
        boolean isEqual = x == y; //will give false
        System.out.println("isEqual = " + isEqual);

        boolean result8 = "Muhtar" == "Good Guy";// will give false
        System.out.println("result8 = " + result8);

        boolean result9 = "Spoon" == "Spoon";//true
        System.out.println("result9 = " + result9);

        boolean result10 = 'A' == 'a'; //char value can be given
        System.out.println("result10 = " + result10);//false

// (!=) NOT EQUAL OPERATOR

        boolean result11 = 100 != 200.50; //true
        System.out.println("result11 = " + result11);

        boolean result12 = "java" != "java";//false
        System.out.println("result12 = " + result12);





    }
}

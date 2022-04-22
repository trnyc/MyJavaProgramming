package day08_IfStatements;

public class GradeReport {
    public static void main(String[] args) {

 /*     System.out.println(true == !false);//true (true equal to not false)
        System.out.println(!true != false);//false (not true not equal to false)
        System.out.println(!false == !true);// false (not false equal to not true)

        System.out.println(!!false);//false
        System.out.println(!!!true);//true   just practice...*/

        int score = 85;
        boolean A = score >= 90 && score <= 100;
        boolean B = score >= 80 && !A; //OR score <90 OR score <= 89
        boolean C = score >= 70 && score <= 79; //OR !A && !B && score >= 70
        boolean D = score >= 60 && score <= 69;
        boolean F = score >= 0 && score <= 59; //OR !A && !B && !C && !D

        if(A) {
            System.out.println("Excellent");
        }
        if(B) {
            System.out.println("Great");
        }
        if(C) {
            System.out.println("Good");
        }
        if(D) {
            System.out.println("Passed");
        }
        if(F) {
            System.out.println("Failed");
        }



    }
}
/*  90-100 ==> Excellent
    80-89  ==> Great
    70-79  ==> Good
    60-69  ==> Passed
    0 -59  ==> Failed
 */
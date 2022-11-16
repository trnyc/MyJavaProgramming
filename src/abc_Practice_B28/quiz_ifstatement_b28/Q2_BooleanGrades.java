package quizzes_B_28.ifstatements;

public class Q2_BooleanGrades {

    public static void main(String[] args) {
        char grade = 'A';
        boolean Passed=  grade =='A' || grade =='B';
        boolean Passed2= grade == 'C'|| grade == 'D';

       // System.out.println("Passed = " + Passed); // output= true
      //  System.out.println("Passed2 = " + Passed2); // output= false

        if (Passed || Passed2) {

            System.out.println("You've passed the exam");
        }
        else {
            System.out.println("You failed");
        }
// Output= You've passed the exam

    }



}

package quizzes_B_28.customMethods;

public class Q10_ifReturn {
    public static void main(String[] args) {

        //System.out.println(examResult(85));
        examResult(85);
    }

    public static void examResult (int score) {

        if (score <0 || score >100) {
            System.out.println("Unknown");

            return ;
        }

      /*
        if (score >= 60) {
            return "passed";
        } else {
            return "Failed";
        }
*/
    }

// Output = Compiler Error


}

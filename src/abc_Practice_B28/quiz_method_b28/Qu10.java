package abc_Practice_B28.quiz_method_b28;

public class Qu10 {

    public static void main(String[] args) {

        //System.out.println(examResult(85)); // 10
        examResult(85);

    }

    public static void examResult(int score) {

        if (score < 0 || score > 100) {
            System.out.println("Unknown");

            return;
        }

      /*
        if (score >= 60) {
            return "passed";
        } else {
            return "Failed";
        }
        */

    }
}

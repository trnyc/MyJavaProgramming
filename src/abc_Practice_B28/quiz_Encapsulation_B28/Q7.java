package abc_Practice_B28.quiz_Encapsulation_B28;

public class Q7 {

    int score;

    static {
        //score = 75;
    }


    public static void main(String[] args) {
        Q7 obj = new Q7();
        obj.score = 85;

        System.out.println(obj.score);
    }
}

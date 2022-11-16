package abc_Practice_B28.quiz_method_b28;

public class Qu4 {

    public static void main(String[] args) { //question 4
        System.out.println(method(100));
    }

    public static String method(int num){
        if(num < 0){
            return "Less than 0";
        } else if (num < 50) {
            return "Less than 50";
        } else if (num < 100) {
            return "Less than 100";
        }else{
            return "other"; //output other
        }
    }
}

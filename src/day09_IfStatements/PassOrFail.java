package day09_IfStatements;

public class PassOrFail {
    public static void main(String[] args) {

        int score = 75;

        if(score >= 60) {//if the score 60 or higher this will be executed
            System.out.println("Congrats, you passed");
        }else{//if the sore NOT 60 or higher, this will be executed
            System.out.println("Failed");
        }
    }

}

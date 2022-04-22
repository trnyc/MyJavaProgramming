package day09_IfStatements;

public class PosNegZero {
    public static void main(String[] args) {

        int n = 100;

        if(n > 0) {
            System.out.println("Positive");
        }
        if(n < 0) {
            System.out.println("Negative");
        }
        if(n == 0) {
            System.out.println("Zero");
        }
        System.out.println("___________________________________________________");

//HERE IS SHORTER WAY OF DOING SAME JOB USING MULTI-BRANCH IF STATEMENT
        if(n > 0) {
            System.out.println("Positive");
        }else if(n < 0){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }



    }
}

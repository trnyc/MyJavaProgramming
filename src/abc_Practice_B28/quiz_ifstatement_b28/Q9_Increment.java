package quizzes_B_28.ifstatements;

public class Q9_Increment {
    public static void main(String[] args) {
        int num= 9;

        if (num++== 10) {  // line 1
            System.out.println("Hello World" +num); //line 2
        } else {
            System.out.println("Hello Universe" + num); // line 3   // Hello Universe10
        }


    }


}

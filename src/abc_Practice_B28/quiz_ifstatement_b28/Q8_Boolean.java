package quizzes_B_28.ifstatements;

public class Q8_Boolean {
    public static void main(String[] args) {

        boolean X = true;
        boolean Y= !X ==false;
        boolean Z= Y;

        if (X) {
            System.out.println("Hello Everyone");
        }
        if (Y) {
            System.out.println("Today is great day");
        }
        if (Z) {
            System.out.println("We are improving everyday");
        }

// Output=Hello Everyone
// Today is great day
// We are improving everyday

    }
}

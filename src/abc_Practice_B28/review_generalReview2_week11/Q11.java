package abc_Practice_B28.review_generalReview2_week11;

public class Q11 {
    public static void main(String[] args) {

        int x = -4;

        while ( x < 0) { // -4 -3 -2
            x++; //-3 -2 -1
            if ( x == -1) { //f f t
                break;
            }
            System.out.println(x); //-3 -2
        }

    } //output -3 -2
}

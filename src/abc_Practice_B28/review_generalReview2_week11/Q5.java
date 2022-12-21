package abc_Practice_B28.review_generalReview2_week11;

public class Q5 {
    public static void main(String[] args) {

        //line1  ???
        int x = 1;

        switch (x) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
        }

    }
}

// byte, short, int, char  -primitive data types work with switch
// double, long (float, boolean,  )gives compile error - not acceptable with switch,
// String gives error because the data type given in switch case values are numbers.
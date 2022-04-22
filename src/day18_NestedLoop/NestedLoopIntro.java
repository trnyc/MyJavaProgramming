package day18_NestedLoop;

public class NestedLoopIntro {
    public static void main(String[] args) {
 /*  NESTED LOOP means loop inside another loop. So there are inner and outer loops.
 First outer loop executed and when outer loop executed one time, inner loop also
 executed given iteration times in the inner loop.
  */

    //WE NEED 4 TIMES OF FOR LOOP TO PRINT STATEMENT 20 TIMES
            for (int i = 0; i < 5; i++) {
                System.out.println("Wooden Spoon");
            }

            for (int i = 0; i < 5; i++) {
                System.out.println("Wooden Spoon");
            }

            for (int i = 0; i < 5; i++) {
                System.out.println("Wooden Spoon");
            }

            for (int i = 0; i < 5; i++) {
                System.out.println("Wooden Spoon");
            }

            System.out.println("-------------------------------------------------");

            for (int j = 0; j < 20; j++) { // j: 0, 1, 2, 3

                for (int i = 0; i < 5; i++) { //i: 0,1,2,3,4
                    System.out.println("Wooden Spoon");
 // THIS WILL PRINT 20 TIMES OF INNER LOOP WHICH IS 100 TIMES IN TOTAL
                }

            }




    }
}

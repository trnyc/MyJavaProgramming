package day15_ForLoop;

public class ForLoopIntro {
    public static void main(String[] args) {
/* If you know how many times you need to repeat a statement, you can use
for loop. If you make a mistake while declaring 'Iteration' it may
executes the statement forever. So you must declare starting and ending
point of the loop.
 */
        System.out.println("Hello World");// to print 10 times, must type it 10 times
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");

        System.out.println("================================================");

     //for(initialization; condition; Iteration){
        for (int i = 1;      i <= 10 ;   i++  ) {
            System.out.println("Hello World");
        }//prints until 'i' reaches to 10 (ten times)

 /* If you leave Iteration part empty, or type smt wrong, it may print the
 statement forever. For ex: if you put 'i--' instead of 'i++'.
  */



    }
}

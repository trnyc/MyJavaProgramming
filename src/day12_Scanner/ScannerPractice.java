package day12_Scanner;

/* import java.util.*;   Scanner is the one of the classes under "util" package.
You can use an "*" instead of Scanner to call all classes under "util". BUT it
uses much more memory this way which make system slower. It is called "wild import"
*/
import java.util.Scanner; //this is regular import

public class ScannerPractice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number between 1 and 7");

        int num = scan.nextInt();
        String result = "";

        if(num >= 1 && num <= 7) {

            result = (num == 1) ? "Monday" : (num == 2) ? "Tuesday" : (num == 3) ? "Wednesday"
                    : (num == 4) ? "Thursday" : (num == 5) ? "Friday" : (num == 6) ? "Saturday"
                    : "Sunday";
        }else {
            result = "Invalid Number";

        }


         System.out.println(result);

        scan.close();

    }
}

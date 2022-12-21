package abc_Practice_B28.week11_Strings_Arrays_ArrayList_Methods_B28;

public class QSample5_Switch {
    public static void main(String[] args) {
           //line1  ???
    int x = 1;
//       byte x= 1;
 //      long x = 1;
//       short x= 1;
  //     String x= "1";
//       double x= 1;


        // byte, short, char, and int -primitive data types work with switch
        // double, long (float, boolean,  )gives compile error - not acceptable with switch,
        // String gives error because the data type given in switch case values are numbers.


        switch (x) {
            case 1:
                System.out.println("One");
                break;

            case 2:
                System.out.println("Two");
        }




    }
}

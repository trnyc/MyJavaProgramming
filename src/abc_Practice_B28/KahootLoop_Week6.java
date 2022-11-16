package abc_Practice_B28;

public class KahootLoop_Week6 {
    public static void main(String[] args) {





//2
/*
        for (int i = 1; i <= 20; i+=2) {
            System.out.println(i);  //output: 1,3,5,7,9,11,13,15,17,19
        }
        for (int i = 0; i <=20; i++) {
            System.out.println(i);// output: 0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20
        }

        for (int i = 0; i <=20 ; i+=2) {
            System.out.println(i);//output= 0,2,4,6,8,10,12,14,16,18,20
        }
        for (int i = 1; i <20; i++) {
            System.out.println(i);  // output= 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19

        }
 */

//4
//        int x= 3;
//        int y= 5;
//        if (++x < (y= y -=2) || (x= x +=2) >= y) {
//            System.out.println(x + " - " + y); // output = 6 -3
//
//        }


//5
/*
        boolean x= true;
        boolean y= false;
        if (x && y) {
            System.out.println(false);
        } else{
            System.out.println(true);// Output:  true
        }
*/
//6
//        for (int i = 0; i < 5; i++) {
//
//            System.out.println("Hello"); // 1 2
//            i +=3;// output= Hello Hello
//
//        }
//7
        /*
        for (int i = 1; i <=10 ; i++) {

            if (i==4) {
                break;

            }
            System.out.println(i+ " ");// output= 1 2 3
         */

//8
        /*
        String a = "Hello";
        String b = new String("Hello");

        if (a==b) //false
        {
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
         */
//9

//question 9 first choice red triangle
        /*
        String str = "Hello";
        String res = "";
        for (int i = 0; i <= str.length(); i++) //indexoutofbounds
            res = res + str.charAt(i);
        System.out.println(res);
        */
// question 9 second choice blue diamond
        /*
        String str="Hello";
        String res="";

        for (int i =str.length() -1; i>=0 ; i--) //olleH
            res = res + str.charAt(i);
        System.out.println(res);
        */
//question 9 third choice yellow circle
/*
        String str = "Hello";
        String res = "";
        for (int i = 0; i >= 0; i--)
            res = res + str.charAt(i);//H
        System.out.println(res);

*/
//question 9 fourth choice green square
        /*
        String str = "Hello";
        String res = "";
        for (int i = str.length() - 1; i > 5; i+=str.length())
            res = res + str.charAt(i);//H
        System.out.println(res);
         */

//10
        /*
        for (int i = 0; i <=10; i++) {
            if (i == 5)
                continue;
            System.out.println("" + i);
        }
         */
//11
//        int x = 7;
//        int y = 5;
//
//        if (x < y)
//            System.out.println(true);
//        System.out.println(false);
//        System.out.println("java");

//12
//        int marks = 50;
//
//        if (marks <= 70) {
//            System.out.println("Dinstiction ");
//        } else if (marks >= 35) {
//            System.out.println("Pass ");
//        } else
//            System.out.println("Fail");


//13

//        int x = 1;
//        while (x < 6) {
//            System.out.println("Hello");
//            if (x == 4)
//                break;
//        }



//14
//        int i = 5;
//        do {
//            System.out.println("Cydeo");
//            i++;
//        }
//        while (i < 5);

//15

//        int i = 0;
//        for ( ; i <= 5; i++) {
//
//            System.out.println("i = " + i);
//
//        }
//        System.out.println("i after the loop = " + i);



    }
}

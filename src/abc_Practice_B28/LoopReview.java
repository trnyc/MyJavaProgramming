package abc_Practice_B28;

import java.util.Scanner;

public class LoopReview {

    public static void main(String[] args) {

//2

//        boolean flag = true;
//
//        for (int i = 0; i <= 5; i++) {
//
//            if (flag) {
//                System.out.println(i + " ");
//            }
//            flag = !flag;
//        }

        System.out.println("--------------------------------------------------------");
//3

//        for (char ch = 'A'; ch <= 'D'; ch++) {
//
//            if (ch == 'C') {
//                continue;
//            }
//            System.out.println(ch + " ");//A B
//            if (ch == 'B') {
//                break;
//            }
//        }

        System.out.println("--------------------------------------------------------");

//4

//        int x = 10;
//
//        for (int i = 0; i < 5; i++) {
//            x += i;
//            // System.out.println(x);
//        }
//        System.out.println(x);

        System.out.println("---------------------------------------------");

//5
//        int i = 10;
//        if (i < 10) {
//            System.out.println("Too Short");
//          //   break;// we can not use break in if else statement  but we can use it to terminate the loop and switch case
//            //Break keyword is often used inside loops control structures and switch statements.
//            //It is used to terminate loops and switch statements in java. When the break keyword is encountered within a loop, the loop is immediately terminated and the program control goes to the next statement following the loop.
//        } else {
//            System.out.println(i++);
//        }


        System.out.println("-----------------------------------------------");

// 6
//        String str = "Java";
//        String str2 = new String(str);
//        int count = 10;
//        do {
//            count += 2;
//        } while (str==str2);
//        System.out.println(count);
//
//        System.out.println("----------------------------------------------------");


// 7
//        for (int i = 0; i <= 5; i++) {
//
//            if (i+2 >5) {
//                continue;
//            }
//            System.out.println(i+ " ");// output=   0, 1, 2, 3
//
//        }
//
//        System.out.println("-----------------------------------------------------");


// 8a
//        for (int i = 0; i < 5; i++){
//            System.out.println("Hello");
//            i+=2;
//        } // Hello Hello
//        System.out.println("------------------------------");


//8b
//        for (int i = 0; i <5 ; i++){
//            System.out.println("Hello");
//         break;
//        } // Hello
//
//        System.out.println("---------------------------------");


//        for (int i = 0; i < 10; i++) {
//
//            if( i==5) {
//                    continue;
//            }
//            System.out.print(" "+ i); // 0,1,2,3,4,6,7,8,9
//
//        }

//        System.out.println("------------------------------------");


//        int y= 0;
//        while (y < 4) {
//
//            y = y + 1;
//
//        }
//        System.out.println(y); // output = 4
//
//        System.out.println("-------------------------------------------------------");



//        int counted = 0;
//
//        do{
//            System.out.println("Welcome to Java");
//            counted++;
//        }while (counted<5);
//
//        System.out.println("--------------------------------------------------------");



//        int number = 6;
//        while (number>0) {
//            number -=3;
//            System.out.println(number + " "); // output= 3, 0
//
//        }
//
//        System.out.println("--------------------------------------------------");



//        int v= 0;
//        for (int i = 0; i < 10; i=i+4) { // 0 4 8
//            v++;
//            // System.out.println(v);
//        }
//        System.out.println(v); //3
//
//        System.out.println("------------------------------------------------------");
//        int d = 0;
//
//        while (d<=2){
//            for (int i = 0; i <3; i++){
//                System.out.println("Hi");// Hi will be printed nine times
//            }
//            d++;
//        }
//
//        System.out.println("---------------------------------------------------");


//        int z = -4;
//        while(z<0) {
//            z++;
//            if (z == -1) {
//                break;
//            }
//            System.out.println(z);
//        }
//        System.out.println("-----------------------------------------------------");



//        int time = 50;
//        do {
//            System.out.println(time + ",");
//            time++;
//        }while (time<53);
//
//        System.out.println("-------------------------------------");



//        int i =0;
//
//        for (i=0; i < 6;i++){
//
//            if (i% 3 ==0 )
//                continue;
//            System.out.println(i+",");
//        }

//        int x= 0;
//        int y= 2;
//        while((y!=0) && (x/y) >= 0)
//        {
//            x = x +1;
//            y= y-1;
//        }
//        System.out.println("x = " + x); // x = 2, y=0;
//        System.out.println("y = " + y);



        //System.out.println(true || true && false || false); // true

      String s = "Cydeo";

        for (int i = 0; i < s.length(); i+=3) {
            System.out.println(s.charAt(i));
        }






    }
}

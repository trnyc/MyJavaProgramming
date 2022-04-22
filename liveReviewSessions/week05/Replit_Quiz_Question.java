package week05;

import java.util.Scanner;

public class Replit_Quiz_Question {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("what is the farthest planet in the solar system:");
        System.out.println("a)venus");
        System.out.println("b)pluto");
        System.out.println("c)neptune");

        String result = input.next();

        // your code
/*
        switch (result){
            case "a":
                System.out.println("a is wrong");
                break;
            case  "b":
                System.out.println("b is correct");
                break;
            case "c" :
                System.out.println("c is wrong");
                break;
            default:
                System.out.println(result+" is not a valid answer");
                break;
        }

 */

        if (result.equals("a"))
            System.out.println(result+" is wrong");
        else if(result.equals("b"))
            System.out.println(result+" is correct");
        else if(result.equals("c"))
            System.out.println(result+ "is worng");
        else
            System.out.println(result + " is not a valid answer");

        input.close();

    }
}

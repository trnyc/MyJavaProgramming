package day11_Switch_Scanner;

public class DaysInWeek_SwitchIntro {
    public static void main(String[] args) {
/* You can not use boolean, long, double float in SWITCH statements.
you can put only one and unique statement in every case in SWITCH statement
SWITCH will compare data if its equal (==) or not. And executes if its equal.
Switch statements is faster than IF statement.x
Every task that you can do with SWITCH, can be done also with IF statement
BUT every task you can do with IF statement can not be done with SWITCH.

IN SWITCH statement, compiler directly gos to correct case to execute without
checking other cases. BUT in IF statement compiler checks every case one by one
in order. Thats why its faster.

We need to use "break" after each case in order exit case block after it executed.
Otherwise it executes the next case block automatically even if its not equal to
given data until it reaches next "break" or closing curly braces(}).

NORMALLY you can place default block anywher you want between other case blocks.
But its better to put it at the end. BUT, if you put default block between the
blocks you need to use "break:" this time. Otherwise it prints next available
case block.
 */


        int number = 5;

        switch (number){// 1 2 3 4 5 6 7 8 9

            case 1:
                System.out.println("Monday");
                break;//exits the switch after executing the block

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:// this is like "else" in multi branch if statement
                System.out.println("Invalid");
                break; //you dont have to use break after default


        }




    }
}

package day10_NestedIf;

public class NestedIfIntro {
    public static void main(String[] args) {

        int score = 85;

        if(score >=0 && score <= 100) {// TO CHECK if the score or input is valid
        //java will not check other other if statements if the first one/(pre if) is FALSE
        //so if we input 101 for the "score" it will print "Invalid Score"
            if(score >= 60) { //BE CEREFUL, the if statement between line 10-14 is inside another if
                System.out.println("Passed"); //statement, check the curly braces to understand.
            }else{
                System.out.println("Failed");
            }

        }else{
            System.out.println("Invalid Score");
        }


/* nested if is used to declare a pre condition that is combined other conditions.
we can say its a condidition inside other conditions. Thats why there are two "else"
 in the codes. If the pre condition is true
or valid, java will check or print other conditions, if its false, NOT.
 */

        System.out.println("------------------------------------------------------------------------");

        int age = 19;//must be 21 or older to buy alchool
        boolean hasId = true;

        if(hasId){ // if the person has an ID - pre condition

            if(age>= 21){ // if the person is 21 years old or older
                System.out.println("Eligible to buy alcohol");
            }else{ // if the person is less than 21 years old
                System.out.println("Not eligible to buy alcohol");
            }
        }else{ // if the person does not have an ID
            System.out.println("You must have an ID to buy alcohol");
        }

        System.out.println("-------------------------------------------");

        int number = 5;

        // 1 <= number <= 7
        if(number >= 1 && number<= 7){ // if the number is a valid number (1~7)

            if(number == 1){
                System.out.println("Monday");
            }else if(number == 2){
                System.out.println("Tuesday");
            }else if(number == 3){
                System.out.println("Wednesday");
            }else if(number == 4){
                System.out.println("Thursday");
            }else if(number == 5){
                System.out.println("Friday");
            }else if(number == 6){
                System.out.println("Saturday");
            }else{
                System.out.println("Sunday");
            }

        }else{ // if the number is not valid (if not between 1-7)
            System.out.println("Invalid Number");
        }


































    }
}





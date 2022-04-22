package day23_CustomMethods_VoidMethod;

public class CustomMethodWithParameter {

    public static void oddOrEven(int number){

        if(number %2 ==0){
            System.out.println(number +" is even number");
        }else{
            System.out.println(number +" is odd number");
        }
    }
/* we have created a method named "oddOrEven" and gave a parameter "int number"
that shows data type will be an intiger. And also we put a condition to check
if the number odd or even. Now we will use it in our "main" method.
 */

//task: create a function that can check if a number is odd or even
    public static void main(String[] args) {

        oddOrEven(20);// 20 is even number
/* when we call our method "oddOrEven" we need to put an intiger in it
otherwise it gives compile error. Now, since we called our method here
in main method, it will be executed here and gives the message if the input
intiger number is odd or even.
 */

        ageOfPerson(1975);

/*  we have created this method blow and used here in main method.
 and it calculetes age of a person if you input his birth year.
 */
    }



    public static void ageOfPerson(int birthYear){

        int age = 2022 - birthYear;
        System.out.println("Your age is "+ age);

    }









}
